package br1;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbr1/a;", "", "", "packageUrl", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "assetsPaths", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f19575b;

    public a(String str, ArrayList<String> arrayList) {
        str.getClass();
        arrayList.getClass();
        this.f19574a = str;
        this.f19575b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19574a.equals(aVar.f19574a) && this.f19575b.equals(aVar.f19575b);
    }

    public final int hashCode() {
        return this.f19575b.hashCode() + (this.f19574a.hashCode() * 31);
    }

    public final String toString() {
        return "StorageManifest(packageUrl=" + this.f19574a + ", assetsPaths=" + this.f19575b + ")";
    }
}
