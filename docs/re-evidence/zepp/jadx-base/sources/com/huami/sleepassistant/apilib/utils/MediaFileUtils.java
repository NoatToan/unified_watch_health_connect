package com.huami.sleepassistant.apilib.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.facebook.appevents.UserDataStore;
import com.huami.sleepassistant.apilib.R;
import com.huami.sleepassistant.apilib.bean.AudioResources;
import com.huami.sleepassistant.apilib.db.SleepAssistantDb;
import com.huami.sleepassistant.apilib.vo.MusicVo;
import com.huami.tools.analytics.DbUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.h;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J*\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ*\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0011J\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003¨\u0006\u001a"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/MediaFileUtils;", "", "", "", "getDirFiles", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sleepassistant/apilib/vo/MusicVo;", "item", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/sleepassistant/apilib/utils/OnDownLoadStatusCallBack;", "mOnDownLoadStatusCallBack", "", "loadDownMusic", "Lcom/huami/sleepassistant/apilib/bean/AudioResources;", "dataList", "Lcom/huami/sleepassistant/apilib/utils/OnDownLoadResourceStatusCallBack;", "loadDownResourceMusic", "src", "destPath", "", "copyFile", "<init>", "()V", "Companion", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class MediaFileUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String a = "";

    @NotNull
    public static final String baseAssistantPath = "music/";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\"\u0010\t\u001a\u00020\b8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/MediaFileUtils$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "initUtils", "Lcom/huami/sleepassistant/apilib/utils/MediaFileUtils;", "newInstance", "", "baseDirSleepAssistantPath", "Ljava/lang/String;", "getBaseDirSleepAssistantPath", "()Ljava/lang/String;", "setBaseDirSleepAssistantPath", "(Ljava/lang/String;)V", "baseAssistantPath", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getBaseDirSleepAssistantPath() {
            if (!TextUtils.isEmpty(MediaFileUtils.a)) {
                return MediaFileUtils.a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            String str = File.separator;
            sb.append((Object) str);
            sb.append("com.xiaomi.hm.health");
            sb.append((Object) str);
            sb.append("sleep_assistant");
            sb.append((Object) str);
            return sb.toString();
        }

        public final void initUtils(@Nullable Context context) {
            StringBuilder sb = new StringBuilder();
            sb.append(context == null ? null : context.getFilesDir());
            String str = File.separator;
            sb.append((Object) str);
            sb.append("com.xiaomi.hm.health");
            sb.append((Object) str);
            setBaseDirSleepAssistantPath(sb.toString());
        }

        @JvmStatic
        @NotNull
        public final MediaFileUtils newInstance() {
            return new MediaFileUtils();
        }

        public final void setBaseDirSleepAssistantPath(@NotNull String str) {
            MediaFileUtils.a = str;
        }
    }

    public static /* synthetic */ void loadDownMusic$default(MediaFileUtils mediaFileUtils, Context context, MusicVo musicVo, SleepAssistantDb sleepAssistantDb, OnDownLoadStatusCallBack onDownLoadStatusCallBack, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        mediaFileUtils.loadDownMusic(context, musicVo, sleepAssistantDb, onDownLoadStatusCallBack);
    }

    public static /* synthetic */ void loadDownResourceMusic$default(MediaFileUtils mediaFileUtils, Context context, List list, OnDownLoadResourceStatusCallBack onDownLoadResourceStatusCallBack, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        mediaFileUtils.loadDownResourceMusic(context, list, onDownLoadResourceStatusCallBack);
    }

    @JvmStatic
    @NotNull
    public static final MediaFileUtils newInstance() {
        return INSTANCE.newInstance();
    }

    public final boolean copyFile(@NotNull Context context, @NotNull String src, @NotNull String destPath) {
        int i;
        File file = new File(INSTANCE.getBaseDirSleepAssistantPath());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(destPath);
        if (file2.exists()) {
            file2.delete();
        }
        try {
            file2.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(src);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            do {
                i = inputStreamOpen.read(bArr);
                fileOutputStream.write(bArr, 0, i);
            } while (i != -1);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @NotNull
    public final List<String> getDirFiles() {
        ArrayList arrayList = new ArrayList();
        File file = new File(INSTANCE.getBaseDirSleepAssistantPath());
        if (!file.exists()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (file.isDirectory() && file.listFiles() != null) {
            h.addAll(arrayList2, file.listFiles());
        }
        int i = 0;
        int size = arrayList2.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                arrayList.add(((File) arrayList2.get(i)).getName());
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public final void loadDownMusic(@Nullable Context context, @NotNull MusicVo item, @NotNull SleepAssistantDb db, @NotNull OnDownLoadStatusCallBack mOnDownLoadStatusCallBack) {
        new DownloadTask(context, db, INSTANCE.getBaseDirSleepAssistantPath(), item, mOnDownLoadStatusCallBack).execute(item.getAudioUrl());
    }

    public final void loadDownResourceMusic(@Nullable Context context, @Nullable List<AudioResources> dataList, @NotNull OnDownLoadResourceStatusCallBack mOnDownLoadStatusCallBack) {
        IntRange indices;
        if (dataList == null) {
            indices = null;
        } else {
            try {
                indices = CollectionsKt__CollectionsKt.getIndices(dataList);
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(context, R.string.sls_down_like_music_fail, 0).show();
                return;
            }
        }
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            int i = first + 1;
            new DownloadResourceTask(context, INSTANCE.getBaseDirSleepAssistantPath(), mOnDownLoadStatusCallBack, first).execute(dataList.get(first).getSleepAudioUrl(), dataList.get(first).getSleepAudioId());
            if (first == last) {
                return;
            } else {
                first = i;
            }
        }
    }
}
