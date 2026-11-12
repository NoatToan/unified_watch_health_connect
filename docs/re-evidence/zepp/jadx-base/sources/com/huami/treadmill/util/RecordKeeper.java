package com.huami.treadmill.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.data.BoltRecordStatics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/treadmill/util/RecordKeeper;", "", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class RecordKeeper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "record_keep";

    @NotNull
    private static final String b = "bolt_record_data";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/treadmill/util/RecordKeeper$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/treadmill/data/BoltRecordStatics;", "data", "", "setBoltRecordData", "", "getBoltRecordData", "clear", "BOLT_RECORD_DATA", "Ljava/lang/String;", "KEEP_XML", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clear(@Nullable Context context) {
            SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences(RecordKeeper.a, 0);
            SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
            if (editorEdit != null) {
                editorEdit.clear();
            }
            if (editorEdit == null) {
                return;
            }
            editorEdit.apply();
        }

        @Nullable
        public final String getBoltRecordData(@Nullable Context context) {
            SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences(RecordKeeper.a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            return sharedPreferences.getString(RecordKeeper.b, "");
        }

        public final void setBoltRecordData(@Nullable Context context, @Nullable BoltRecordStatics data) {
            SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences(RecordKeeper.a, 0);
            SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
            if (editorEdit != null) {
                editorEdit.putString(RecordKeeper.b, HMHttpUtils.getGson().toJson(data));
            }
            if (editorEdit == null) {
                return;
            }
            editorEdit.apply();
        }
    }
}
