package kx2;

import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkx2/c;", "", "garminDeviceResponse", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errors", "<init>", "(Ljava/lang/Object;[Ljava/lang/Exception;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f107126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception[] f107127b;

    public c(Object obj, Exception[] excArr) {
        this.f107126a = obj;
        this.f107127b = excArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c cVar = (c) obj;
        if (!s.g(this.f107126a, cVar.f107126a)) {
            return false;
        }
        Exception[] excArr = cVar.f107127b;
        Exception[] excArr2 = this.f107127b;
        if (excArr2 != null) {
            if (excArr == null || !Arrays.equals(excArr2, excArr)) {
                return false;
            }
        } else if (excArr != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f107126a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Exception[] excArr = this.f107127b;
        return iHashCode + (excArr != null ? Arrays.hashCode(excArr) : 0);
    }
}
