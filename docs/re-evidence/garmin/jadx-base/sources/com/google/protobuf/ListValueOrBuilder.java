package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ListValueOrBuilder extends MessageOrBuilder {
    Value getValues(int i14);

    int getValuesCount();

    List<Value> getValuesList();

    ValueOrBuilder getValuesOrBuilder(int i14);

    List<? extends ValueOrBuilder> getValuesOrBuilderList();
}
