package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pl, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lol;", PluginDeviceInfo.FMODEL, "(Lol;)Ljava/lang/Object;", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class C3621pl {

    /* JADX INFO: renamed from: pl$a, reason: from Kotlin metadata and collision with other inner class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class C1074a extends Lambda implements Function0<String> {
        public final /* synthetic */ ol<T> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1074a(ol<T> olVar) {
            super(0);
            this.t = olVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Peel failed: " + this.t;
        }
    }

    @Nullable
    public static final <T> T a(@NotNull ol<T> olVar) {
        Intrinsics.checkNotNullParameter(olVar, "<this>");
        if (olVar instanceof fu) {
            return (T) ((fu) olVar).a();
        }
        le.c("ModuleResult", new C1074a(olVar));
        return null;
    }
}
