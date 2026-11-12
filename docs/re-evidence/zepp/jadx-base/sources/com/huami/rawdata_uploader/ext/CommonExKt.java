package com.huami.rawdata_uploader.ext;

import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0000¨\u0006\u0006"}, d2 = {"", "tag", "Lkotlin/Function0;", "messageCollector", "", "commonLog", "rawdata-uploader_release"}, k = 2, mv = {1, 5, 1})
public final class CommonExKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Function0<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<String> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.invoke();
        }
    }

    public static final void commonLog(@NotNull String str, @NotNull Function0<String> function0) {
        HMLog.info("RawData--" + str, new a(function0));
    }
}
