package app.jaid.devrays.debug;

/**
 * Information about an argument that is member of {@link CommandDescriptor}. Gets fetched from commands.json in
 * {@link Shell#setCommandLib}.
 *
 * @author jaid
 */
public class ArgumentDescriptor {

	private boolean essential;
	private String name, type, description;
	private String[] values;

	public String[] getAllowedValues()
	{
		return values;
	}

	public String getDescription()
	{
		return description;
	}

	public String getName()
	{
		return name;
	}

	public String getType()
	{
		return type;
	}

	public boolean isEssential()
	{
		return essential;
	}

	@Override
	public String toString()
	{
		return (!essential ? "*Optional " : "") + type + " " + name + (description != null ? ": " + description : "");
	}
}
