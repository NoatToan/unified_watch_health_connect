package com.huami.sync;

import com.google.android.gms.fitness.data.Field;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH&¨\u0006\f"}, d2 = {"Lcom/huami/sync/NetSource;", "", "", Constants.DATA_KEY_HR, "", GetWatermarkAPI.KEY_NAME_STEPS, Field.NUTRIENT_CALORIES, "time", "Lcom/huami/sync/UploadResult;", SnoreListFragment.TYPE_UPLOAD, "Lcom/huami/sync/ToggleResult;", "toggle", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public interface NetSource {
    @Nullable
    ToggleResult toggle();

    @Nullable
    UploadResult upload(int hr, long steps, long calories, long time);
}
