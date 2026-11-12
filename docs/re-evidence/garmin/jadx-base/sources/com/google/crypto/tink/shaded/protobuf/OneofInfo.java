package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
final class OneofInfo {
    private final Field caseField;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f53628id;
    private final Field valueField;

    public OneofInfo(int i14, Field field, Field field2) {
        this.f53628id = i14;
        this.caseField = field;
        this.valueField = field2;
    }

    public Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f53628id;
    }

    public Field getValueField() {
        return this.valueField;
    }
}
