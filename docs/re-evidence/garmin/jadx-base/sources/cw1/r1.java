package cw1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcw1/r1;", "", "", "Lu4/d;", "imageVectorList", "", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u4.d> f56185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56186b;

    public r1(List list, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? p13.j0.f134944a : list, (i14 & 2) != 0 ? "" : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return p005kotlin.jvm.internal.s.g(this.f56185a, r1Var.f56185a) && p005kotlin.jvm.internal.s.g(this.f56186b, r1Var.f56186b);
    }

    public final int hashCode() {
        return this.f56186b.hashCode() + (this.f56185a.hashCode() * 31);
    }

    public final String toString() {
        return "TrainingLevelFeature(imageVectorList=" + this.f56185a + ", text=" + this.f56186b + ")";
    }

    public r1() {
        this(null, null, 3, null);
    }

    public r1(List<u4.d> list, String str) {
        list.getClass();
        str.getClass();
        this.f56185a = list;
        this.f56186b = str;
    }
}
