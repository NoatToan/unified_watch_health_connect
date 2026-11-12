package com.nimbusds.jose;

import androidx.core.view.j;
import java.security.Key;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class KeyTypeException extends KeyException {
    public KeyTypeException(Class<? extends Key> cls, Class<?>... clsArr) {
        super("Invalid key: Must be an instance of " + cls + " and implement all of the following interfaces " + Arrays.toString(clsArr));
    }

    public KeyTypeException(Class<? extends Key> cls) {
        super(j.h(cls, "Invalid key: Must be an instance of "));
    }
}
