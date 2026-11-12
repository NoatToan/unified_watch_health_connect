package b5;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lb5/r0;", "Lh5/x0;", "Lb5/v0;", "", "key1", "key2", "", UserMetadata.KEYDATA_FILENAME, "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputEventHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 extends h5.x0<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f15879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointerInputEventHandler f15880d;

    public /* synthetic */ r0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : obj, (i14 & 2) != 0 ? null : obj2, (i14 & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new v0(this.f15877a, this.f15878b, this.f15879c, this.f15880d);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (!p005kotlin.jvm.internal.s.g(this.f15877a, r0Var.f15877a) || !p005kotlin.jvm.internal.s.g(this.f15878b, r0Var.f15878b)) {
            return false;
        }
        Object[] objArr = r0Var.f15879c;
        Object[] objArr2 = this.f15879c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f15880d == r0Var.f15880d;
    }

    @Override // h5.x0
    public final int hashCode() {
        Object obj = this.f15877a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f15878b;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f15879c;
        return this.f15880d.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "pointerInput";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f15877a, "key1");
        v3Var.c(this.f15878b, "key2");
        v3Var.c(this.f15879c, UserMetadata.KEYDATA_FILENAME);
        v3Var.c(this.f15880d, "pointerInputEventHandler");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        v0 v0Var = (v0) cVar;
        Object obj = v0Var.f15905a;
        Object obj2 = this.f15877a;
        boolean z14 = !p005kotlin.jvm.internal.s.g(obj, obj2);
        v0Var.f15905a = obj2;
        Object obj3 = v0Var.f15906b;
        Object obj4 = this.f15878b;
        if (!p005kotlin.jvm.internal.s.g(obj3, obj4)) {
            z14 = true;
        }
        v0Var.f15906b = obj4;
        Object[] objArr = v0Var.f15907c;
        Object[] objArr2 = this.f15879c;
        if (objArr != null && objArr2 == null) {
            z14 = true;
        }
        if (objArr == null && objArr2 != null) {
            z14 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z14 = true;
        }
        v0Var.f15907c = objArr2;
        Class<?> cls = v0Var.f15909e.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f15880d;
        if (cls == pointerInputEventHandler.getClass() ? z14 : true) {
            v0Var.i0();
        }
        v0Var.f15909e = pointerInputEventHandler;
    }

    public r0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f15877a = obj;
        this.f15878b = obj2;
        this.f15879c = objArr;
        this.f15880d = pointerInputEventHandler;
    }
}
