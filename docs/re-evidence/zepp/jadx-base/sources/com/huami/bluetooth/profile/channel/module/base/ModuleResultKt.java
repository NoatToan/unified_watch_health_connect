package com.huami.bluetooth.profile.channel.module.base;

import androidx.exifinterface.media.ExifInterface;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "peel", "(Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;)Ljava/lang/Object;", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class ModuleResultKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ModuleResult<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ModuleResult<T> moduleResult) {
            super(0);
            this.a = moduleResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Peel failed: ", this.a);
        }
    }

    @Nullable
    public static final <T> T peel(@NotNull ModuleResult<T> moduleResult) {
        if (moduleResult instanceof Success) {
            return (T) ((Success) moduleResult).getData();
        }
        HMLog.info("ModuleResult", new a(moduleResult));
        return null;
    }
}
