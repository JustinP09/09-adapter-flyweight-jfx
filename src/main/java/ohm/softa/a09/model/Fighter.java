package ohm.softa.a09.model;

import javafx.scene.image.Image;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Peter Kurfer
 */

public abstract class Fighter {

	private final String pilot; 	//extrinsic also variable, weil piloten immer anders heißen
	private final Image fighterImage;	//intrinsic also statisch, weil immer die selben bilder verwendet werden

	public Fighter(String pilot, Image fighterImage) {
		this.pilot = pilot;
		this.fighterImage = fighterImage;
	}

	public String getPilot() {
		return pilot;
	}

	public Image getFighterImage() {
		return fighterImage;
	}

	public abstract Force getSideOfForce();

	public abstract String getFighterType();

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (!(o instanceof Fighter)) return false;

		Fighter fighter = (Fighter) o;

		return new EqualsBuilder()
			.append(getPilot(), fighter.getPilot())
			.append(getFighterType(), fighter.getFighterType())
			.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
			.append(getPilot())
			.append(getFighterType())
			.toHashCode();
	}
}
