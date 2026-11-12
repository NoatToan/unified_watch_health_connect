package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.network.embedded.g4;
import com.huawei.hms.network.embedded.r3;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u001fB\u0013\b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0005¨\u0006 "}, d2 = {"Lkotlin/Result;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue$annotations", "()V", r3.A, "", "isSuccess-impl", "(Ljava/lang/Object;)Z", "isFailure", "isFailure-impl", "getOrNull", "getOrNull-impl", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "equals", "other", WatchFaceConstant.HASHCODE, "", "Companion", "Failure", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
public final class yyt<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f53903b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f53904a;

    public static <T> Object e(Object obj) {
        return obj;
    }

    public static final boolean c(Object obj) {
        return !(obj instanceof e);
    }

    public static final boolean b(Object obj) {
        return obj instanceof e;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f53905a;
        }
        return null;
    }

    public String toString() {
        return g(this.f53904a);
    }

    public static String g(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + g4.l;
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u0006H\u0087\b¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Result$Companion;", "", "<init>", "()V", "success", "Lkotlin/Result;", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "failure", TrackConstants$Events.EXCEPTION, "", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", TrackConstants$Events.EXCEPTION, "", "<init>", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f53905a;

        public e(Throwable th) {
            zcp.c(th, "");
            this.f53905a = th;
        }

        public boolean equals(Object other) {
            return (other instanceof e) && zcp.b(this.f53905a, ((e) other).f53905a);
        }

        public int hashCode() {
            return this.f53905a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f53905a + g4.l;
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final /* synthetic */ Object getF53904a() {
        return this.f53904a;
    }

    public int hashCode() {
        return d(this.f53904a);
    }

    public boolean equals(Object other) {
        return c(this.f53904a, other);
    }

    public static int d(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof yyt) && zcp.b(obj, ((yyt) obj2).getF53904a());
    }
}
