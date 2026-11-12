package com.facebook.internal.instrument.errorreport;

import androidx.annotation.RestrictTo;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import com.huami.widget.share.ShareAnalytics;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.g;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/instrument/errorreport/ErrorReportHandler;", "", "", "msg", "", ShareAnalytics.ParamValue.SAVE, "enable", "sendErrorReports", "", "Ljava/io/File;", "listErrorReportFiles", "()[Ljava/io/File;", "", "a", LogUtil.I, "MAX_ERROR_REPORT_NUM", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ErrorReportHandler {

    @NotNull
    public static final ErrorReportHandler INSTANCE = new ErrorReportHandler();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int MAX_ERROR_REPORT_NUM = 1000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "dir", "", "name", "", "accept", "(Ljava/io/File;Ljava/lang/String;)Z", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements FilenameFilter {
        public static final a a = new a();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{InstrumentUtility.ERROR_REPORT_PREFIX}, 1))).matches(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/facebook/internal/instrument/errorreport/ErrorReportData;", "kotlin.jvm.PlatformType", "o1", "o2", "", "a", "(Lcom/facebook/internal/instrument/errorreport/ErrorReportData;Lcom/facebook/internal/instrument/errorreport/ErrorReportData;)I"}, k = 3, mv = {1, 5, 1})
    public static final class b<T> implements Comparator {
        public static final b a = new b();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(ErrorReportData errorReportData, ErrorReportData errorReportData2) {
            return errorReportData.compareTo(errorReportData2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "(Lcom/facebook/GraphResponse;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements GraphRequest.Callback {
        public final /* synthetic */ ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.GraphRequest.Callback
        public final void onCompleted(@NotNull GraphResponse graphResponse) {
            JSONObject jsonObject;
            try {
                if (graphResponse.getError() == null && (jsonObject = graphResponse.getJsonObject()) != null && jsonObject.getBoolean("success")) {
                    Iterator it2 = this.a.iterator();
                    while (it2.hasNext()) {
                        ((ErrorReportData) it2.next()).clear();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    private ErrorReportHandler() {
    }

    @JvmStatic
    public static final void enable() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            sendErrorReports();
        }
    }

    @JvmStatic
    @NotNull
    public static final File[] listErrorReportFiles() {
        File instrumentReportDir = InstrumentUtility.getInstrumentReportDir();
        return instrumentReportDir != null ? instrumentReportDir.listFiles(a.a) : new File[0];
    }

    @JvmStatic
    public static final void save(@Nullable String msg) {
        try {
            new ErrorReportData(msg).save();
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    public static final void sendErrorReports() {
        if (Utility.isDataProcessingRestricted()) {
            return;
        }
        File[] fileArrListErrorReportFiles = listErrorReportFiles();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListErrorReportFiles) {
            ErrorReportData errorReportData = new ErrorReportData(file);
            if (errorReportData.isValid()) {
                arrayList.add(errorReportData);
            }
        }
        g.sortWith(arrayList, b.a);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 1000; i++) {
            jSONArray.put(arrayList.get(i));
        }
        InstrumentUtility.sendReports("error_reports", jSONArray, new c(arrayList));
    }
}
