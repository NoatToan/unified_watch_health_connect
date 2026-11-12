package lc;

import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB;\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Llc/t;", "", "Llc/q0;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "isNullable", "defaultValue", "defaultValuePresent", "unknownDefaultValuePresent", "<init>", "(Llc/q0;ZLjava/lang/Object;ZZ)V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0<Object> f111866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f111867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f111868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f111869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f111870e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llc/t$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q0<Object> f111871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f111872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f111873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f111874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f111875e;

        /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:59:0x0106  */
        public final t a() {
            Class<?> componentType;
            q0 gVar = this.f111871a;
            if (gVar == null) {
                q0.b bVar = q0.f111837b;
                Object obj = this.f111873c;
                bVar.getClass();
                if (obj instanceof Integer) {
                    gVar = q0.f111838c;
                    gVar.getClass();
                } else if (obj instanceof int[]) {
                    gVar = q0.f111840e;
                    gVar.getClass();
                } else if (obj instanceof Long) {
                    gVar = q0.f111842g;
                    gVar.getClass();
                } else if (obj instanceof long[]) {
                    gVar = q0.f111843h;
                    gVar.getClass();
                } else if (obj instanceof Float) {
                    gVar = q0.f111845j;
                    gVar.getClass();
                } else if (obj instanceof float[]) {
                    gVar = q0.f111846k;
                    gVar.getClass();
                } else if (obj instanceof Boolean) {
                    gVar = q0.f111848m;
                    gVar.getClass();
                } else if (obj instanceof boolean[]) {
                    gVar = q0.f111849n;
                    gVar.getClass();
                } else if ((obj instanceof String) || obj == null) {
                    gVar = q0.f111851p;
                    gVar.getClass();
                } else {
                    gVar = null;
                }
                if (gVar == null) {
                    if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                        gVar = q0.f111852q;
                        gVar.getClass();
                    } else {
                        obj.getClass();
                        if (obj.getClass().isArray()) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            componentType2.getClass();
                            if (Parcelable.class.isAssignableFrom(componentType2)) {
                                Class<?> componentType3 = obj.getClass().getComponentType();
                                componentType3.getClass();
                                gVar = new q0.d(componentType3);
                            } else if (obj.getClass().isArray()) {
                                componentType = obj.getClass().getComponentType();
                                componentType.getClass();
                                if (Serializable.class.isAssignableFrom(componentType)) {
                                    Class<?> componentType4 = obj.getClass().getComponentType();
                                    componentType4.getClass();
                                    gVar = new q0.f(componentType4);
                                } else if (obj instanceof Parcelable) {
                                    gVar = new q0.e(obj.getClass());
                                } else if (obj instanceof Enum) {
                                    gVar = new q0.c(obj.getClass());
                                } else {
                                    if (obj instanceof Serializable) {
                                        org.apache.commons.lang3.e.r("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                                        return null;
                                    }
                                    gVar = new q0.g(obj.getClass());
                                }
                            } else if (obj instanceof Parcelable) {
                                gVar = new q0.e(obj.getClass());
                            } else if (obj instanceof Enum) {
                                gVar = new q0.c(obj.getClass());
                            } else {
                                if (obj instanceof Serializable) {
                                    org.apache.commons.lang3.e.r("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                                    return null;
                                }
                                gVar = new q0.g(obj.getClass());
                            }
                        } else if (obj.getClass().isArray()) {
                            componentType = obj.getClass().getComponentType();
                            componentType.getClass();
                            if (Serializable.class.isAssignableFrom(componentType)) {
                                Class<?> componentType5 = obj.getClass().getComponentType();
                                componentType5.getClass();
                                gVar = new q0.f(componentType5);
                            } else if (obj instanceof Parcelable) {
                                gVar = new q0.e(obj.getClass());
                            } else if (obj instanceof Enum) {
                                gVar = new q0.c(obj.getClass());
                            } else {
                                if (obj instanceof Serializable) {
                                    org.apache.commons.lang3.e.r("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                                    return null;
                                }
                                gVar = new q0.g(obj.getClass());
                            }
                        } else if (obj instanceof Parcelable) {
                            gVar = new q0.e(obj.getClass());
                        } else if (obj instanceof Enum) {
                            gVar = new q0.c(obj.getClass());
                        } else {
                            if (obj instanceof Serializable) {
                                org.apache.commons.lang3.e.r("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                                return null;
                            }
                            gVar = new q0.g(obj.getClass());
                        }
                    }
                }
            }
            return new t(gVar, this.f111872b, this.f111873c, this.f111874d, this.f111875e);
        }
    }

    public t(q0<Object> q0Var, boolean z14, Object obj, boolean z15, boolean z16) {
        q0Var.getClass();
        if (!q0Var.f111854a && z14) {
            kg.f.l(q0Var.b(), " does not allow nullable values");
            throw null;
        }
        if (!z14 && z15 && obj == null) {
            androidx.core.view.j.s("Argument with type ", q0Var.b(), " has null value but is not nullable.");
            throw null;
        }
        this.f111866a = q0Var;
        this.f111867b = z14;
        this.f111870e = obj;
        this.f111868c = z15 || z16;
        this.f111869d = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f111867b != tVar.f111867b || this.f111868c != tVar.f111868c || !this.f111866a.equals(tVar.f111866a)) {
            return false;
        }
        Object obj2 = tVar.f111870e;
        Object obj3 = this.f111870e;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f111866a.hashCode() * 31) + (this.f111867b ? 1 : 0)) * 31) + (this.f111868c ? 1 : 0)) * 31;
        Object obj = this.f111870e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(p005kotlin.jvm.internal.s0.f105811a.b(t.class).D());
        sb3.append(" Type: " + this.f111866a);
        sb3.append(" Nullable: " + this.f111867b);
        if (this.f111868c) {
            sb3.append(" DefaultValue: " + this.f111870e);
        }
        return sb3.toString();
    }
}
