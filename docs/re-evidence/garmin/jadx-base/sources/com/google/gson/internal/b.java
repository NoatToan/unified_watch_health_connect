package com.google.gson.internal;

import java.lang.reflect.Type;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.apache.commons.lang3.reflect.Typed;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ObjectConstructor, Typed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Type f53848b;

    public /* synthetic */ b(int i14, Type type) {
        this.f53847a = i14;
        this.f53848b = type;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.f53847a) {
            case 0:
                return ConstructorConstructor.lambda$newSpecialCollectionConstructor$5(this.f53848b);
            default:
                return ConstructorConstructor.lambda$newSpecialCollectionConstructor$6(this.f53848b);
        }
    }

    @Override // org.apache.commons.lang3.reflect.Typed
    public Type getType() {
        return TypeUtils.lambda$wrap$0(this.f53848b);
    }
}
