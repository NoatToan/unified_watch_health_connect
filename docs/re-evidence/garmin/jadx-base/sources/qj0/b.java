package qj0;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lqj0/b;", "WrappedValue", "", "customObject", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b<WrappedValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fields")
    private final WrappedValue customObject;

    public b(WrappedValue wrappedvalue) {
        this.customObject = wrappedvalue;
    }

    public final WrappedValue a() {
        return this.customObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && s.g(this.customObject, ((b) obj).customObject);
    }

    public final int hashCode() {
        WrappedValue wrappedvalue = this.customObject;
        if (wrappedvalue == null) {
            return 0;
        }
        return wrappedvalue.hashCode();
    }

    public final String toString() {
        return org.apache.commons.lang3.e.f("ContentfulEntityDTO(customObject=", ")", this.customObject);
    }
}
