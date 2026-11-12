package com.xiaomi.hm.health.homepage.status.card;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.activeandroid.Cache;
import com.activeandroid.Model;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.dataflow.model.firstbeat.bean.SportLoadDataItem;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/card/ContentObserverToListener;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/lang/Class;", "Lcom/activeandroid/Model;", "cls", "Landroid/net/Uri;", "a", "", "registerContentObserver", "", "Lcom/xiaomi/hm/health/homepage/status/card/ContentObserverToListener$UriType;", "Ljava/util/Map;", "uris", "com/xiaomi/hm/health/homepage/status/card/ContentObserverToListener$contentObserver$1", "b", "Lcom/xiaomi/hm/health/homepage/status/card/ContentObserverToListener$contentObserver$1;", "contentObserver", "<init>", "()V", "UriType", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ContentObserverToListener {

    @NotNull
    public static final ContentObserverToListener INSTANCE = new ContentObserverToListener();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Map<Uri, UriType> uris = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final ContentObserverToListener$contentObserver$1 contentObserver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/card/ContentObserverToListener$UriType;", "", "<init>", "(Ljava/lang/String;I)V", SensorRecordsEnity.SensorType.SENSOR_ECG, "VO2MAX", "SPORT_LOAD", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public enum UriType {
        ECG,
        VO2MAX,
        SPORT_LOAD
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Uri a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri) {
            super(0);
            this.a = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "listening " + this.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.xiaomi.hm.health.homepage.status.card.ContentObserverToListener$contentObserver$1] */
    static {
        final Handler handler = new Handler(Looper.getMainLooper());
        contentObserver = new ContentObserver(handler) { // from class: com.xiaomi.hm.health.homepage.status.card.ContentObserverToListener$contentObserver$1

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ContentObserverToListener.UriType.values().length];
                    iArr[ContentObserverToListener.UriType.ECG.ordinal()] = 1;
                    iArr[ContentObserverToListener.UriType.VO2MAX.ordinal()] = 2;
                    iArr[ContentObserverToListener.UriType.SPORT_LOAD.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Uri a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Uri uri) {
                    super(0);
                    this.a = uri;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return String.valueOf(this.a);
                }
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, @Nullable Uri uri) {
                Object next;
                super.onChange(selfChange, uri);
                HMLog.verbose("ActiveAndroidDataChange", new a(uri));
                if (uri == null) {
                    return;
                }
                Iterator it2 = ContentObserverToListener.uris.entrySet().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!m.startsWith$default(uri.toString(), ((Uri) ((Map.Entry) next).getKey()).toString(), false, 2, null));
                Map.Entry entry = (Map.Entry) next;
                ContentObserverToListener.UriType uriType = entry != null ? (ContentObserverToListener.UriType) entry.getValue() : null;
                if (uriType == null) {
                    return;
                }
                int i = WhenMappings.$EnumSwitchMapping$0[uriType.ordinal()];
                if (i == 1) {
                    DataNotifiers.INSTANCE.getEcgNotifier().notifyInvalidated();
                } else if (i == 2) {
                    DataNotifiers.INSTANCE.getVo2maxNotifier().notifyInvalidated();
                } else {
                    if (i != 3) {
                        return;
                    }
                    DataNotifiers.INSTANCE.getSportLoadNotifier().notifyInvalidated();
                }
            }
        };
    }

    private ContentObserverToListener() {
    }

    private final Uri a(Context context, Class<? extends Model> cls) {
        return Uri.parse(("content://" + context.getPackageName() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) + Cache.getTableName(cls).toLowerCase(Locale.getDefault()));
    }

    public final void registerContentObserver(@NotNull Context context) {
        Uri uriA = a(context, VO2maxDataItem.class);
        Uri uriA2 = a(context, SportLoadDataItem.class);
        Map<Uri, UriType> map = uris;
        map.put(uriA, UriType.VO2MAX);
        map.put(uriA2, UriType.SPORT_LOAD);
        int i = 0;
        Uri[] uriArr = {uriA, uriA2};
        while (i < 2) {
            Uri uri = uriArr[i];
            i++;
            context.getContentResolver().registerContentObserver(uri, true, contentObserver);
            HMLog.verbose("ActiveAndroidDataChange", new a(uri));
        }
    }
}
