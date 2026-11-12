package com.xiaomi.fitness.health.ecg.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import coil.util.Utils;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.c0j;
import defpackage.hym;
import defpackage.iji;
import defpackage.pni;
import defpackage.x44;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\n\u001a\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\nH\u0002\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\n\u001a\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n\u001a\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0002\u001a\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"TAG", "", "shareByShareSheet", "", "context", "Landroid/content/Context;", "outputFile", "Ljava/io/File;", "fileType", "getFileTypeStr", "", "getDesFile", "getResultPath", "getAnalyzeStatusStr", FitnessDBConstants.COL_ECG_INTERPRET_STATUS, "showAnalysisStatusTag", "tag", "Landroid/widget/TextView;", "status", "getTagBgResId", "getTagTextColor", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcgExtKt {

    @NotNull
    public static final String TAG = "EcgExt";

    @NotNull
    public static final String getAnalyzeStatusStr(int i) {
        if (i == 1 || i == 2) {
            return ResourceExtKt.getString(c0j.Ia);
        }
        return i != 3 ? ResourceExtKt.getString(c0j.La) : ResourceExtKt.getString(c0j.la);
    }

    @NotNull
    public static final File getDesFile(int i) {
        String resultPath = getResultPath(i);
        File file = new File(resultPath);
        if (file.exists()) {
            file.delete();
        }
        return new File(resultPath);
    }

    @NotNull
    public static final String getFileTypeStr(int i) {
        if (i != 1) {
            return i != 2 ? "" : Utils.MIME_TYPE_JPEG;
        }
        return "application/pdf";
    }

    private static final String getResultPath(int i) {
        String str;
        if (i != 1) {
            str = i != 2 ? "" : ".jpeg";
        } else {
            str = ".pdf";
        }
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("EcgPdf");
        return (externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + File.separator + "ecg-report" + str;
    }

    private static final int getTagBgResId(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return pni.G2;
        }
        if (i != 3) {
            return 0;
        }
        return pni.F2;
    }

    private static final int getTagTextColor(int i) {
        int i2;
        if (i == 0 || i == 1 || i == 2) {
            i2 = iji.y3;
        } else {
            i2 = i != 3 ? iji.A3 : iji.x2;
        }
        return x44.a(i2);
    }

    public static final void shareByShareSheet(@NotNull Context context, @Nullable File file, @NotNull String fileType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        if (file == null) {
            return;
        }
        Uri uriFromFile = Uri.fromFile(file);
        Intent intent = new Intent();
        Uri uriA = hym.a(context, intent, uriFromFile);
        Logger.d(TAG, "uri=" + uriFromFile + " safeUri=" + uriA);
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriA);
        intent.setType(fileType);
        context.startActivity(intent);
    }

    public static final void showAnalysisStatusTag(@NotNull TextView tag, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        tag.setText(getAnalyzeStatusStr(i));
        tag.setBackgroundResource(getTagBgResId(i));
        tag.setTextColor(getTagTextColor(i));
    }
}
