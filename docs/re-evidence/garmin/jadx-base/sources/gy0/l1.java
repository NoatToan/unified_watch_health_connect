package gy0;

import com.garmin.android.apps.connectmobile.f3;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lgy0/l1;", "", "<init>", "()V", "a", "b", "Lgy0/l1$a;", "Lgy0/l1$b;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class l1 {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgy0/l1$a;", "Lgy0/l1;", "", "fileName", "", "byteArray", "<init>", "(Ljava/lang/String;[B)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends l1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f80190b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, byte[] bArr) {
            super(null);
            str.getClass();
            bArr.getClass();
            this.f80189a = str;
            this.f80190b = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f80189a, aVar.f80189a) && Arrays.equals(this.f80190b, aVar.f80190b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f80190b) + (this.f80189a.hashCode() * 31);
        }

        public final String toString() {
            return v.e0.g("ProcessedImage(fileName=", this.f80189a, ", byteArray=", Arrays.toString(this.f80190b), ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgy0/l1$b;", "Lgy0/l1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends l1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f80191a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(null);
            exc.getClass();
            this.f80191a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f80191a, ((b) obj).f80191a);
        }

        public final int hashCode() {
            return this.f80191a.hashCode();
        }

        public final String toString() {
            return f3.h(this.f80191a, "ProcessedImageError(exception=", ")");
        }
    }

    public /* synthetic */ l1(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private l1() {
    }
}
