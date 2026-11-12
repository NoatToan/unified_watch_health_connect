package pu0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpu0/k;", "", "", "Lpu0/b;", "contacts", "", "isSelfMessenger", "isMessengerSmsStatusForSelfSupported", "<init>", "(Ljava/util/List;ZZ)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f141286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f141287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f141288c;

    public k(List<b> list, boolean z14, boolean z15) {
        list.getClass();
        this.f141286a = list;
        this.f141287b = z14;
        this.f141288c = z15;
    }

    public static k a(k kVar, ArrayList arrayList) {
        boolean z14 = kVar.f141287b;
        boolean z15 = kVar.f141288c;
        kVar.getClass();
        return new k(arrayList, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f141286a.equals(kVar.f141286a) && this.f141287b == kVar.f141287b && this.f141288c == kVar.f141288c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141288c) + q6.f.g(this.f141286a.hashCode() * 31, 31, this.f141287b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserContact(contacts=");
        sb3.append(this.f141286a);
        sb3.append(", isSelfMessenger=");
        sb3.append(this.f141287b);
        sb3.append(", isMessengerSmsStatusForSelfSupported=");
        return hb.a.k(sb3, this.f141288c, ")");
    }
}
