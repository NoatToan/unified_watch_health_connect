package com.huami.tools.log;

import android.os.Build;
import android.util.Log;
import com.amap.api.mapcore.util.hl;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J6\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\n\u001a\u00020\u00028P@\u0010X\u0090\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006&"}, d2 = {"Lcom/huami/tools/log/SimpleConsoleLogTree;", "Lcom/huami/tools/log/Tree;", "", "rawTag", "f", "Ljava/lang/StackTraceElement;", "element", "g", "", "priority", "tag", "message", "", GoogleApiAvailabilityLight.b, "currentTrace", "h", z.j, "trace", hl.k, "m", "", "isLoggable", "code", "", "t", "log", "Lcom/huami/tools/log/SimpleConsoleLogTree$Builder;", "b", "Lcom/huami/tools/log/SimpleConsoleLogTree$Builder;", "mBuilder", "l", "()Ljava/lang/String;", "threadInfo", "getTag$log_release", "<init>", "(Lcom/huami/tools/log/SimpleConsoleLogTree$Builder;)V", "Companion", ShareStoryContent.Builder.k, "log_release"}, k = 1, mv = {1, 4, 0})
public class SimpleConsoleLogTree extends Tree {
    private static final int c;
    private static final int d = 4000;
    private static final Pattern e;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Builder mBuilder;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001f\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010#\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\n¨\u0006*"}, d2 = {"Lcom/huami/tools/log/SimpleConsoleLogTree$Builder;", "", "Lcom/huami/tools/log/SimpleConsoleLogTree;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Ljava/lang/String;", "getPrefixTag", "()Ljava/lang/String;", "setPrefixTag", "(Ljava/lang/String;)V", "prefixTag", "", "b", "Z", "getShowThreadInfo", "()Z", "setShowThreadInfo", "(Z)V", "showThreadInfo", "c", "getShowTraceInfo", "setShowTraceInfo", "showTraceInfo", GoogleApiAvailabilityLight.a, "getShowMethodInfo", "setShowMethodInfo", "showMethodInfo", "e", "getShowMetadata", "setShowMetadata", "showMetadata", "f", "getShowMetadataInTail", "setShowMetadataInTail", "showMetadataInTail", "g", "getTargetStackElementPrefix", "setTargetStackElementPrefix", "targetStackElementPrefix", "<init>", "()V", "log_release"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private String prefixTag = "";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private boolean showThreadInfo = true;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean showTraceInfo = true;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean showMethodInfo = true;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private boolean showMetadata = true;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private boolean showMetadataInTail = true;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private String targetStackElementPrefix = "";

        @NotNull
        public final SimpleConsoleLogTree build() {
            return new SimpleConsoleLogTree(this);
        }

        @NotNull
        public final String getPrefixTag() {
            return this.prefixTag;
        }

        public final boolean getShowMetadata() {
            return this.showMetadata;
        }

        public final boolean getShowMetadataInTail() {
            return this.showMetadataInTail;
        }

        public final boolean getShowMethodInfo() {
            return this.showMethodInfo;
        }

        public final boolean getShowThreadInfo() {
            return this.showThreadInfo;
        }

        public final boolean getShowTraceInfo() {
            return this.showTraceInfo;
        }

        @NotNull
        public final String getTargetStackElementPrefix() {
            return this.targetStackElementPrefix;
        }

        public final void setPrefixTag(@NotNull String str) {
            this.prefixTag = str;
        }

        public final void setShowMetadata(boolean z) {
            this.showMetadata = z;
        }

        public final void setShowMetadataInTail(boolean z) {
            this.showMetadataInTail = z;
        }

        public final void setShowMethodInfo(boolean z) {
            this.showMethodInfo = z;
        }

        public final void setShowThreadInfo(boolean z) {
            this.showThreadInfo = z;
        }

        public final void setShowTraceInfo(boolean z) {
            this.showTraceInfo = z;
        }

        public final void setTargetStackElementPrefix(@NotNull String str) {
            this.targetStackElementPrefix = str;
        }
    }

    static {
        c = Build.VERSION.SDK_INT > 23 ? 200 : 23;
        e = Pattern.compile("(\\$\\d+)+$");
    }

    public SimpleConsoleLogTree(@NotNull Builder builder) {
        this.mBuilder = builder;
        if (builder.getTargetStackElementPrefix().length() > 0) {
            StackTraceHelper.INSTANCE.setTargetStackElementPrefix(builder.getTargetStackElementPrefix());
        }
    }

    private final String f(String rawTag) {
        String prefixTag = this.mBuilder.getPrefixTag();
        if (prefixTag.length() > 0) {
            rawTag = prefixTag + '-' + rawTag;
        }
        int length = rawTag.length();
        int i = c;
        return length > i ? rawTag.substring(0, i) : rawTag;
    }

    private final String g(StackTraceElement element) {
        String className = element.getClassName();
        Matcher matcher = e.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll("");
        }
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) className, '.', 0, false, 6, (Object) null) + 1;
        if (className == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = className.substring(iLastIndexOf$default);
        int length = strSubstring.length();
        int i = c;
        return length > i ? strSubstring.substring(0, i) : strSubstring;
    }

    private final String h(StackTraceElement currentTrace) {
        String str = "";
        if (this.mBuilder.getShowMetadataInTail()) {
            return "";
        }
        if (this.mBuilder.getShowThreadInfo()) {
            str = "" + l();
        }
        if (this.mBuilder.getShowMethodInfo()) {
            if (!(str.length() == 0)) {
                str = str + " | ";
            }
            str = str + k(currentTrace);
        }
        if (!(str.length() > 0)) {
            return str;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("[ %s ] ", Arrays.copyOf(new Object[]{str}, 1));
    }

    private final String j(StackTraceElement currentTrace) {
        String str = "";
        if (this.mBuilder.getShowTraceInfo()) {
            str = "" + m(currentTrace);
        }
        if (this.mBuilder.getShowMetadataInTail()) {
            if (this.mBuilder.getShowMethodInfo()) {
                if (str.length() > 0) {
                    str = str + " -> ";
                }
                str = str + k(currentTrace);
            }
            if (this.mBuilder.getShowThreadInfo()) {
                if (str.length() > 0) {
                    str = str + " | ";
                }
                str = str + l();
            }
        }
        if (!(str.length() > 0)) {
            return str;
        }
        return " >>> " + str;
    }

    private final String k(StackTraceElement trace) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s()", Arrays.copyOf(new Object[]{trace.getMethodName()}, 1));
    }

    private final String l() {
        Thread threadCurrentThread = Thread.currentThread();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("Thread:%s, %s", Arrays.copyOf(new Object[]{Long.valueOf(threadCurrentThread.getId()), threadCurrentThread.getName()}, 2));
    }

    private final String m(StackTraceElement trace) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("(%s:%s)", Arrays.copyOf(new Object[]{trace.getFileName(), Integer.valueOf(trace.getLineNumber())}, 2));
    }

    private final void n(int priority, String tag, String message) {
        int iMin;
        if (message.length() < 4000) {
            if (priority == 7) {
                Log.wtf(tag, message);
                return;
            } else {
                Log.println(priority, tag, message);
                return;
            }
        }
        int i = 0;
        int length = message.length();
        while (i < length) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) message, '\n', i, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf$default, i + 4000);
                String strSubstring = message.substring(i, iMin);
                if (priority == 7) {
                    Log.wtf(tag, strSubstring);
                } else {
                    Log.println(priority, tag, strSubstring);
                }
                if (iMin >= iIndexOf$default) {
                    break;
                } else {
                    i = iMin;
                }
            }
            i = iMin + 1;
        }
    }

    @Override // com.huami.tools.log.Tree
    @NotNull
    public String getTag$log_release() {
        String str = getExplicitTag$log_release().get();
        if (str != null) {
            getExplicitTag$log_release().remove();
        }
        if (str != null) {
            return f(str);
        }
        StackTraceElement invokeTraceElement = StackTraceHelper.INSTANCE.getInvokeTraceElement();
        return invokeTraceElement != null ? g(invokeTraceElement) : "";
    }

    @Override // com.huami.tools.log.Tree
    public boolean isLoggable(@Nullable String tag, int priority) {
        return true;
    }

    @Override // com.huami.tools.log.Tree
    public void log(int priority, @Nullable String tag, @NotNull String message, @Nullable String code, @Nullable Throwable t) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement invokeTraceElement = StackTraceHelper.INSTANCE.getInvokeTraceElement();
        if (!this.mBuilder.getShowMetadata() || invokeTraceElement == null) {
            if (!(code == null || m.isBlank(code))) {
                sb.append("Code: " + code + " | ");
            }
            sb.append(message);
        } else {
            sb.append(h(invokeTraceElement));
            if (!(code == null || m.isBlank(code))) {
                sb.append("Code: " + code + " | ");
            }
            sb.append(message);
            sb.append(j(invokeTraceElement));
        }
        n(priority, tag, sb.toString());
    }
}
