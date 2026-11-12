package gy0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lgy0/m;", "", "<init>", "()V", "d", "b", "c", "a", "Lgy0/m$a;", "Lgy0/m$b;", "Lgy0/m$c;", "Lgy0/m$d;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgy0/m$a;", "Lgy0/m;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f80192a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1704595735;
        }

        public final String toString() {
            return "ImageErrorAllImagesInvalid";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgy0/m$b;", "Lgy0/m;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f80193a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -141012276;
        }

        public final String toString() {
            return "ImageErrorGeneric";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgy0/m$c;", "Lgy0/m;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f80194a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1395430386;
        }

        public final String toString() {
            return "ImageErrorTooLarge";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgy0/m$d;", "Lgy0/m;", "", "Lcy0/o;", "uploadedImages", "<init>", "(Ljava/util/List;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<cy0.o> f80195a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<cy0.o> list) {
            super(null);
            list.getClass();
            this.f80195a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f80195a, ((d) obj).f80195a);
        }

        public final int hashCode() {
            return this.f80195a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ImagesUploaded(uploadedImages=", ")", this.f80195a);
        }
    }

    public /* synthetic */ m(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private m() {
    }
}
