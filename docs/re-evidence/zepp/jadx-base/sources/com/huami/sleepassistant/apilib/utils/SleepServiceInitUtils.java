package com.huami.sleepassistant.apilib.utils;

import android.content.Context;
import com.facebook.appevents.UserDataStore;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.sleepassistant.apilib.R;
import com.huami.sleepassistant.apilib.bean.MusicBean;
import com.huami.sleepassistant.apilib.db.SleepAssistantDb;
import com.huami.sleepassistant.apilib.helper.AppExecutors;
import com.huami.sleepassistant.apilib.utils.SleepServiceInitUtils;
import com.huami.sleepassistant.apilib.utils.ext.WebBeanToPoExKt;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/SleepServiceInitUtils;", "", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", UserDataStore.DATE_OF_BIRTH, "", PointCategory.INIT, "", "Lcom/huami/sleepassistant/apilib/bean/MusicBean;", "list", "insertDb", "Landroid/content/Context;", "a", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "Companion", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class SleepServiceInitUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static SleepServiceInitUtils b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/SleepServiceInitUtils$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sleepassistant/apilib/utils/SleepServiceInitUtils;", "getInstance", DefaultSettingsSpiCall.n, "Lcom/huami/sleepassistant/apilib/utils/SleepServiceInitUtils;", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized SleepServiceInitUtils getInstance(@NotNull Context context) {
            if (SleepServiceInitUtils.b == null) {
                SleepServiceInitUtils.b = new SleepServiceInitUtils(context.getApplicationContext(), null);
            }
            return SleepServiceInitUtils.b;
        }
    }

    private SleepServiceInitUtils(Context context) {
        this.mContext = context;
    }

    public /* synthetic */ SleepServiceInitUtils(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SleepAssistantDb sleepAssistantDb, SleepServiceInitUtils sleepServiceInitUtils) {
        if (sleepAssistantDb.sleepAssistantDao().queryMusicList().size() < 3) {
            ArrayList arrayList = new ArrayList();
            Context context = sleepServiceInitUtils.mContext;
            int i = R.string.sls_built_in_music_name1;
            arrayList.add(new MusicBean(BuiltInMusicUtils.MUSIC_ID_1, 0, context.getString(i), "", "", "", "", sleepServiceInitUtils.mContext.getString(i), "file:///android_asset/bg_img/1574129084405.webp", "file:///android_asset/sm_img/1574129084405.webp", "", 0));
            Context context2 = sleepServiceInitUtils.mContext;
            int i2 = R.string.sls_built_in_music_name2;
            arrayList.add(new MusicBean(BuiltInMusicUtils.MUSIC_ID_2, 0, context2.getString(i2), "", "", "", "", sleepServiceInitUtils.mContext.getString(i2), "file:///android_asset/bg_img/1574129238105.webp", "file:///android_asset/sm_img/1574129238105.webp", "", 0));
            Context context3 = sleepServiceInitUtils.mContext;
            int i3 = R.string.sls_built_in_music_name3;
            arrayList.add(new MusicBean(BuiltInMusicUtils.MUSIC_ID_3, 0, context3.getString(i3), "", "", "", "", sleepServiceInitUtils.mContext.getString(i3), "file:///android_asset/bg_img/1574129356025.webp", "file:///android_asset/sm_img/1574129356025.webp", "", 0));
            sleepServiceInitUtils.insertDb(sleepAssistantDb, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final List list, final SleepAssistantDb sleepAssistantDb) {
        sleepAssistantDb.runInTransaction(new Runnable() { // from class: l17
            @Override // java.lang.Runnable
            public final void run() {
                SleepServiceInitUtils.f(sleepAssistantDb, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SleepAssistantDb sleepAssistantDb, List list) {
        sleepAssistantDb.sleepAssistantDao().deleteMusicListItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(WebBeanToPoExKt.toMusic((MusicBean) it2.next()));
        }
        sleepAssistantDb.sleepAssistantDao().insertOrUpdateMusic(arrayList);
    }

    public final void init(@NotNull final SleepAssistantDb db) {
        new AppExecutors().getNetworkIO().execute(new Runnable() { // from class: k17
            @Override // java.lang.Runnable
            public final void run() {
                SleepServiceInitUtils.d(db, this);
            }
        });
    }

    public final void insertDb(@NotNull final SleepAssistantDb db, @NotNull final List<MusicBean> list) {
        db.runInTransaction(new Runnable() { // from class: m17
            @Override // java.lang.Runnable
            public final void run() {
                SleepServiceInitUtils.e(list, db);
            }
        });
    }
}
