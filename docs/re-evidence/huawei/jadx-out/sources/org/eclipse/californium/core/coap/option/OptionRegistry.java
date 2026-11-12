package org.eclipse.californium.core.coap.option;

/* JADX INFO: loaded from: classes20.dex */
public interface OptionRegistry extends Iterable<Entry> {

    public interface Entry {
        int getKey();

        OptionDefinition getOptioneDefinition();
    }

    boolean contains(OptionDefinition optionDefinition);

    OptionDefinition getDefinitionByName(String str);

    OptionDefinition getDefinitionByNumber(int i);

    OptionDefinition getDefinitionByNumber(int i, int i2);
}
