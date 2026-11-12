package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \r*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\rB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy;", ExifInterface.LONGITUDE_EAST, "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "entries", "", "<init>", "([Ljava/lang/Enum;)V", "c", "Ljava/lang/Class;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zbs<E extends Enum<E>> implements Serializable {
    private static final d d = new d(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<E> f53971a;

    public zbs(E[] eArr) {
        zcp.c(eArr, "");
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        zcp.e(cls);
        this.f53971a = cls;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy$Companion;", "", "<init>", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class d {
        private d() {
        }

        public /* synthetic */ d(zcm zcmVar) {
            this();
        }
    }

    private final Object readResolve() {
        E[] enumConstants = this.f53971a.getEnumConstants();
        zcp.b((Object) enumConstants, "");
        return enumEntries.c(enumConstants);
    }
}
