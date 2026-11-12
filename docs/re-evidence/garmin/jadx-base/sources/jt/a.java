package jt;

import ht.r;
import java.util.ArrayList;
import p005kotlin.Metadata;
import zk.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljt/a;", "Lht/r;", "", "onboardingItemKey", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100681b;

    public a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f100680a = str;
        this.f100681b = str2;
    }

    @Override // ht.r
    public final zk.a a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e("Action", this.f100681b));
        arrayList.add(new e("FeatureType", this.f100680a));
        return new zk.a("UserAction", arrayList, false, 0L, 12, null);
    }
}
