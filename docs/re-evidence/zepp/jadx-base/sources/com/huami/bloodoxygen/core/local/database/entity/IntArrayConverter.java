package com.huami.bloodoxygen.core.local.database.entity;

import androidx.room.TypeConverter;
import com.google.gson.reflect.TypeToken;
import com.huami.bloodoxygen.core.utils.SharedInstanceKt;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/IntArrayConverter;", "", "", "value", "", "", "getIntArrayFromString", "getStringFromIntArray", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class IntArrayConverter {

    @NotNull
    public static final IntArrayConverter INSTANCE = new IntArrayConverter();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "IntArrayConverter";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th) {
            super(0);
            this.a = str;
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "IntArrayConverter getIntArrayFromString error value(" + this.a + ") " + this.b.getMessage();
        }
    }

    private IntArrayConverter() {
    }

    @JvmStatic
    @TypeConverter
    @NotNull
    public static final List<Integer> getIntArrayFromString(@NotNull String value) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl((List) SharedInstanceKt.getGson().fromJson(value, new TypeToken<List<? extends Integer>>() { // from class: com.huami.bloodoxygen.core.local.database.entity.IntArrayConverter$getIntArrayFromString$1$type$1
            }.getType()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info$default(null, new a(value, thM3848exceptionOrNullimpl), 1, null);
        }
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = listEmptyList;
        }
        return (List) objM3845constructorimpl;
    }

    @JvmStatic
    @TypeConverter
    @NotNull
    public static final String getStringFromIntArray(@NotNull List<Integer> value) {
        return SharedInstanceKt.getGson().toJson(value);
    }
}
