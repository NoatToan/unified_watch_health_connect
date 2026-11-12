package org.apache.commons.lang3;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f133462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object[] f133463c;

    public /* synthetic */ f(String str, Object[] objArr, int i14) {
        this.f133461a = i14;
        this.f133462b = str;
        this.f133463c = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f133461a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return String.format(this.f133462b, this.f133463c);
    }
}
