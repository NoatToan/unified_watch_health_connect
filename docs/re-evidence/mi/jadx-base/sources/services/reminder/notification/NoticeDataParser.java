package services.reminder.notification;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0005J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0018\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lservices/reminder/notification/NoticeDataParser;", "", "<init>", "()V", "PARAM_TAG_START", "", "PARAM_TAG_END", "PATTERN_PARAM", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "PATTERN_PARAM_NAME", "mProviders", "", "Lservices/reminder/notification/INoticeDataProvider;", "getMProviders", "()Ljava/util/Map;", "TAG", "registerDataProvider", "", "provider", "name", "getParsedValue", "key", "parseParamIfNeed", MiuiCursorConstants.CONTENT, "reminder_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoticeDataParser {

    @NotNull
    private static final String PARAM_TAG_END = "</arg>";

    @NotNull
    private static final String PARAM_TAG_START = "<arg>";

    @NotNull
    private static final String TAG = "NoticeDataParser";

    @NotNull
    public static final NoticeDataParser INSTANCE = new NoticeDataParser();
    private static final Pattern PATTERN_PARAM = Pattern.compile("<arg>[a-zA-Z0-9_]+</arg>");
    private static final Pattern PATTERN_PARAM_NAME = Pattern.compile("<arg>([^*]+?)</arg>");

    @NotNull
    private static final Map<String, INoticeDataProvider> mProviders = new ArrayMap();

    private NoticeDataParser() {
    }

    @NotNull
    public final Map<String, INoticeDataProvider> getMProviders() {
        return mProviders;
    }

    @Nullable
    public final String getParsedValue(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        INoticeDataProvider iNoticeDataProvider = mProviders.get(key);
        if (iNoticeDataProvider != null) {
            return iNoticeDataProvider.provide();
        }
        Logger.e(TAG, "Unhandled param " + key);
        return null;
    }

    @Nullable
    public final String parseParamIfNeed(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Matcher matcher = PATTERN_PARAM.matcher(content);
        HashMap map = new HashMap();
        while (true) {
            String strGroup = null;
            if (!matcher.find()) {
                break;
            }
            String strGroup2 = matcher.group(matcher.groupCount());
            Matcher matcher2 = PATTERN_PARAM_NAME.matcher(strGroup2);
            while (matcher2.find()) {
                strGroup = matcher2.group(matcher2.groupCount());
            }
            map.put(strGroup, strGroup2);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Intrinsics.checkNotNull(str);
            String parsedValue = getParsedValue(str);
            if (TextUtils.isEmpty(content)) {
                return null;
            }
            Regex regex = new Regex(str2);
            Intrinsics.checkNotNull(parsedValue);
            content = regex.replace(content, parsedValue);
        }
        return content;
    }

    public final void registerDataProvider(@NotNull INoticeDataProvider provider, @NotNull String name) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(name, "name");
        mProviders.put(name, provider);
    }
}
