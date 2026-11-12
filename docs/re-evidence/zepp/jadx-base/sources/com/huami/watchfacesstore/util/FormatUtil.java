package com.huami.watchfacesstore.util;

import com.huami.tools.log.HMLog;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/watchfacesstore/util/FormatUtil;", "", "", "size", "", "gePackageRoundSize", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FormatUtil {

    @NotNull
    public static final FormatUtil INSTANCE = new FormatUtil();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    private FormatUtil() {
    }

    @NotNull
    public final String gePackageRoundSize(int size) {
        try {
            return new BigDecimal(((double) size) / ((double) 1048576)).setScale(2, 3).toString();
        } catch (Exception e) {
            HMLog.error$default("FormatUtil", null, null, new a(e), 6, null);
            return "";
        }
    }
}
