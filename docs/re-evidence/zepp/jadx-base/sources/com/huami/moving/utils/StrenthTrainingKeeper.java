package com.huami.moving.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/utils/StrenthTrainingKeeper;", "", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class StrenthTrainingKeeper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "strenth_training_keep";

    @NotNull
    private static final String b = "strenth_training";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/moving/utils/StrenthTrainingKeeper$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "data", "", "setStrenthTrainingdData", "getStrenthTraining", "clear", "KEEP_XML", "Ljava/lang/String;", "STRENGTH_TRAINING_KEY", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clear(@Nullable Context context) {
            SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences(StrenthTrainingKeeper.a, 0);
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
        public final String getStrenthTraining(@Nullable Context context) {
            SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences(StrenthTrainingKeeper.a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            return sharedPreferences.getString(StrenthTrainingKeeper.b, "");
        }

        public final void setStrenthTrainingdData(@Nullable Context context, @Nullable String data) {
            SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences(StrenthTrainingKeeper.a, 0);
            SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
            if (editorEdit != null) {
                editorEdit.putString(StrenthTrainingKeeper.b, data);
            }
            if (editorEdit == null) {
                return;
            }
            editorEdit.apply();
        }
    }
}
