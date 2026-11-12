package org.acra.sender;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.acra.ACRA;
import org.acra.ACRAConstants;
import org.acra.ReportField;
import org.acra.attachment.AttachmentUriProvider;
import org.acra.attachment.DefaultAttachmentProvider;
import org.acra.config.ConfigUtils;
import org.acra.config.CoreConfiguration;
import org.acra.config.HttpSenderConfiguration;
import org.acra.data.CrashReportData;
import org.acra.data.StringFormat;
import org.acra.http.BinaryHttpRequest;
import org.acra.http.DefaultHttpRequest;
import org.acra.http.MultipartHttpRequest;
import org.acra.util.BundleWrapper;
import org.acra.util.InstanceCreator;
import org.acra.util.UriUtils;

/* JADX INFO: loaded from: classes23.dex */
public class HttpSender implements ReportSender {
    private final CoreConfiguration a;
    private final HttpSenderConfiguration b;
    private final Uri c;
    private final Method d;
    private final StringFormat e;
    private String f;
    private String g;

    public enum Method {
        POST { // from class: org.acra.sender.HttpSender.Method.1
            @Override // org.acra.sender.HttpSender.Method
            @NonNull
            public URL createURL(@NonNull String str, @NonNull CrashReportData crashReportData) throws MalformedURLException {
                return new URL(str);
            }
        },
        PUT { // from class: org.acra.sender.HttpSender.Method.2
            @Override // org.acra.sender.HttpSender.Method
            @NonNull
            public URL createURL(@NonNull String str, @NonNull CrashReportData crashReportData) throws MalformedURLException {
                return new URL(str + '/' + crashReportData.getString(ReportField.REPORT_ID));
            }
        };

        @NonNull
        public abstract URL createURL(@NonNull String str, @NonNull CrashReportData crashReportData) throws MalformedURLException;

        /* synthetic */ Method(a aVar) {
            this();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Method.values().length];
            a = iArr;
            try {
                iArr[Method.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Method.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public HttpSender(@NonNull CoreConfiguration coreConfiguration, @Nullable Method method, @Nullable StringFormat stringFormat) {
        this(coreConfiguration, method, stringFormat, null);
    }

    private boolean a(@Nullable String str) {
        return str == null || ACRAConstants.NULL_VALUE.equals(str);
    }

    @NonNull
    public String convertToString(CrashReportData crashReportData, @NonNull StringFormat stringFormat) throws Exception {
        return stringFormat.toFormattedString(crashReportData, this.a.reportContent(), com.alipay.sdk.m.s.a.l, "\n", true);
    }

    public void postMultipart(@NonNull CoreConfiguration coreConfiguration, @NonNull Context context, @NonNull String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable Map<String, String> map, @NonNull String str4, @NonNull URL url, @NonNull List<Uri> list) throws IOException {
        new MultipartHttpRequest(coreConfiguration, context, str, str2, str3, i, i2, map).send(url, Pair.create(str4, list));
    }

    public void putAttachment(@NonNull CoreConfiguration coreConfiguration, @NonNull Context context, @Nullable String str, @Nullable String str2, int i, int i2, @Nullable Map<String, String> map, @NonNull URL url, @NonNull Uri uri) throws IOException {
        try {
            new BinaryHttpRequest(coreConfiguration, context, str, str2, i, i2, map).send(new URL(url.toString() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + UriUtils.getFileNameFromUri(context, uri)), uri);
        } catch (FileNotFoundException e) {
            ACRA.log.w("Not sending attachment", e);
        }
    }

    @Override // org.acra.sender.ReportSender
    public /* synthetic */ boolean requiresForeground() {
        return c.a(this);
    }

    @Override // org.acra.sender.ReportSender
    public void send(@NonNull Context context, @NonNull CrashReportData crashReportData) throws ReportSenderException {
        String str;
        String str2;
        try {
            String string = this.c.toString();
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Connect to " + string);
            }
            String strBasicAuthLogin = this.f;
            if (strBasicAuthLogin != null) {
                str = strBasicAuthLogin;
            } else if (a(this.b.basicAuthLogin())) {
                str = null;
            } else {
                strBasicAuthLogin = this.b.basicAuthLogin();
                str = strBasicAuthLogin;
            }
            String strBasicAuthPassword = this.g;
            if (strBasicAuthPassword != null) {
                str2 = strBasicAuthPassword;
            } else if (a(this.b.basicAuthPassword())) {
                str2 = null;
            } else {
                strBasicAuthPassword = this.b.basicAuthPassword();
                str2 = strBasicAuthPassword;
            }
            sendHttpRequests(this.a, context, this.d, this.e.getMatchingHttpContentType(), str, str2, this.b.connectionTimeout(), this.b.socketTimeout(), this.b.httpHeaders(), convertToString(crashReportData, this.e), this.d.createURL(string, crashReportData), ((AttachmentUriProvider) new InstanceCreator().create(this.a.attachmentUriProvider(), new InstanceCreator.Fallback() { // from class: za4
                @Override // org.acra.util.InstanceCreator.Fallback
                public final Object get() {
                    return new DefaultAttachmentProvider();
                }
            })).getAttachments(context, this.a));
        } catch (Exception e) {
            throw new ReportSenderException("Error while sending " + this.a.reportFormat() + " report via Http " + this.d.name(), e);
        }
    }

    @Override // org.acra.sender.ReportSender
    public /* synthetic */ void send(Context context, CrashReportData crashReportData, BundleWrapper bundleWrapper) throws ReportSenderException {
        c.c(this, context, crashReportData, bundleWrapper);
    }

    public void sendHttpRequests(@NonNull CoreConfiguration coreConfiguration, @NonNull Context context, @NonNull Method method, @NonNull String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable Map<String, String> map, @NonNull String str4, @NonNull URL url, @NonNull List<Uri> list) throws IOException {
        int i3 = a.a[method.ordinal()];
        if (i3 == 1) {
            if (list.isEmpty()) {
                sendWithoutAttachments(coreConfiguration, context, method, str, str2, str3, i, i2, map, str4, url);
                return;
            } else {
                postMultipart(coreConfiguration, context, str, str2, str3, i, i2, map, str4, url, list);
                return;
            }
        }
        if (i3 != 2) {
            return;
        }
        sendWithoutAttachments(coreConfiguration, context, method, str, str2, str3, i, i2, map, str4, url);
        Iterator<Uri> it2 = list.iterator();
        while (it2.hasNext()) {
            putAttachment(coreConfiguration, context, str2, str3, i, i2, map, url, it2.next());
        }
    }

    public void sendWithoutAttachments(@NonNull CoreConfiguration coreConfiguration, @NonNull Context context, @NonNull Method method, @NonNull String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable Map<String, String> map, @NonNull String str4, @NonNull URL url) throws IOException {
        new DefaultHttpRequest(coreConfiguration, context, method, str, str2, str3, i, i2, map).send(url, str4);
    }

    public void setBasicAuth(@Nullable String str, @Nullable String str2) {
        this.f = str;
        this.g = str2;
    }

    public HttpSender(@NonNull CoreConfiguration coreConfiguration, @Nullable Method method, @Nullable StringFormat stringFormat, @Nullable String str) {
        this.a = coreConfiguration;
        HttpSenderConfiguration httpSenderConfiguration = (HttpSenderConfiguration) ConfigUtils.getPluginConfiguration(coreConfiguration, HttpSenderConfiguration.class);
        this.b = httpSenderConfiguration;
        this.d = method == null ? httpSenderConfiguration.httpMethod() : method;
        this.c = Uri.parse(str == null ? httpSenderConfiguration.uri() : str);
        this.e = stringFormat == null ? coreConfiguration.reportFormat() : stringFormat;
        this.f = null;
        this.g = null;
    }
}
