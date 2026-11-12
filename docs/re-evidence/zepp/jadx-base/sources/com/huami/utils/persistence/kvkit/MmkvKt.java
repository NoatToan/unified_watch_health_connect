package com.huami.utils.persistence.kvkit;

import android.content.Context;
import com.getkeepsafe.relinker.ReLinker;
import com.huami.tools.analytics.DbUtils;
import com.huami.utils.persistence.kvkit.MmkvKt;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVHandler;
import com.tencent.mmkv.MMKVLogLevel;
import com.tencent.mmkv.MMKVRecoverStrategic;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u001a$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0000\"\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/utils/persistence/kvkit/KvPersistenceLogger;", "logger", "", "initMmkv", "", "fileName", "", "isMultiProcess", "rootPath", "Lcom/tencent/mmkv/MMKV;", "getMmkv", "a", "Ljava/lang/String;", "CRYPT_KEY", "library_release"}, k = 2, mv = {1, 5, 1})
public final class MmkvKt {

    @NotNull
    private static final String a = "huami_kv_persistence";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, String str) {
        ReLinker.loadLibrary(context, str);
    }

    @NotNull
    public static final MMKV getMmkv(@NotNull String str, boolean z, @Nullable String str2) {
        if (!(!m.isBlank(str))) {
            throw new IllegalArgumentException("fileName should not be empty or blank".toString());
        }
        int i = z ? 2 : 1;
        MMKV mmkvMmkvWithID = MMKV.mmkvWithID(str, i, a, str2);
        return mmkvMmkvWithID == null ? MMKV.mmkvWithID(str, i, a) : mmkvMmkvWithID;
    }

    public static /* synthetic */ MMKV getMmkv$default(String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return getMmkv(str, z, str2);
    }

    public static final void initMmkv(@NotNull final Context context, @Nullable final KvPersistenceLogger kvPersistenceLogger) {
        MMKV.initialize(Intrinsics.stringPlus(context.getFilesDir().getAbsolutePath(), "/mmkv"), new MMKV.LibLoader() { // from class: q75
            @Override // com.tencent.mmkv.MMKV.LibLoader
            public final void loadLibrary(String str) {
                MmkvKt.b(context, str);
            }
        }, MMKVLogLevel.LevelInfo);
        MMKV.registerHandler(new MMKVHandler() { // from class: com.huami.utils.persistence.kvkit.MmkvKt.initMmkv.2

            /* JADX INFO: renamed from: com.huami.utils.persistence.kvkit.MmkvKt$initMmkv$2$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[MMKVLogLevel.values().length];
                    iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
                    iArr[MMKVLogLevel.LevelInfo.ordinal()] = 2;
                    iArr[MMKVLogLevel.LevelWarning.ordinal()] = 3;
                    iArr[MMKVLogLevel.LevelError.ordinal()] = 4;
                    iArr[MMKVLogLevel.LevelNone.ordinal()] = 5;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.tencent.mmkv.MMKVHandler
            public void mmkvLog(@NotNull MMKVLogLevel level, @NotNull String file, int line, @NotNull String func, @NotNull String message) {
                if (kvPersistenceLogger == null) {
                    return;
                }
                String str = "file ：" + file + "  line ：" + line + "  func：" + func + "  message：" + message;
                int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
                if (i == 1) {
                    kvPersistenceLogger.log(3, str);
                    return;
                }
                if (i == 2) {
                    kvPersistenceLogger.log(4, str);
                } else if (i == 3) {
                    kvPersistenceLogger.log(5, str);
                } else {
                    if (i != 4) {
                        return;
                    }
                    kvPersistenceLogger.log(6, str);
                }
            }

            @Override // com.tencent.mmkv.MMKVHandler
            @NotNull
            public MMKVRecoverStrategic onMMKVCRCCheckFail(@Nullable String mmapID) {
                return MMKVRecoverStrategic.OnErrorRecover;
            }

            @Override // com.tencent.mmkv.MMKVHandler
            @NotNull
            public MMKVRecoverStrategic onMMKVFileLengthError(@Nullable String p0) {
                return MMKVRecoverStrategic.OnErrorRecover;
            }

            @Override // com.tencent.mmkv.MMKVHandler
            public boolean wantLogRedirecting() {
                return true;
            }
        });
    }

    public static /* synthetic */ void initMmkv$default(Context context, KvPersistenceLogger kvPersistenceLogger, int i, Object obj) {
        if ((i & 2) != 0) {
            kvPersistenceLogger = null;
        }
        initMmkv(context, kvPersistenceLogger);
    }
}
