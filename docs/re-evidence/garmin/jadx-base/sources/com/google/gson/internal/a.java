package com.google.gson.internal;

import com.google.android.gms.tasks.OnFailureListener;
import com.mapbox.common.movement.GoogleActivityRecognition;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ObjectConstructor, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53846b;

    public /* synthetic */ a(String str, int i14) {
        this.f53845a = i14;
        this.f53846b = str;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.f53845a) {
            case 0:
                return ConstructorConstructor.lambda$newUnsafeAllocator$20(this.f53846b);
            case 1:
                return ConstructorConstructor.lambda$newDefaultConstructor$7(this.f53846b);
            case 2:
                return ConstructorConstructor.lambda$newDefaultConstructor$8(this.f53846b);
            case 3:
                return ConstructorConstructor.lambda$get$2(this.f53846b);
            case 4:
                return ConstructorConstructor.lambda$get$3(this.f53846b);
            default:
                return ConstructorConstructor.lambda$get$4(this.f53846b);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        GoogleActivityRecognition.Companion.withLogs$lambda$7(this.f53846b, exc);
    }
}
