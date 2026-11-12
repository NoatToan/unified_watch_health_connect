package com.huami.treadmill;

import android.content.Context;
import com.bumptech.glide.request.RequestOptions;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.util.GlideRoundTransform;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/huami/treadmill/TdmillConfig;", "", "Lcom/bumptech/glide/request/RequestOptions;", "getGldieSharedOptions", "getAvatarOptions", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getRoundOptions", "a", "Lcom/bumptech/glide/request/RequestOptions;", "sharedOptions", "b", "avatarOptions", "c", "roundOptions", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdmillConfig {

    @NotNull
    public static final TdmillConfig INSTANCE = new TdmillConfig();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static RequestOptions sharedOptions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static RequestOptions avatarOptions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static RequestOptions roundOptions;

    private TdmillConfig() {
    }

    @NotNull
    public final RequestOptions getAvatarOptions() {
        if (avatarOptions == null) {
            RequestOptions requestOptions = new RequestOptions();
            int i = R.drawable.td_avatar_default;
            avatarOptions = requestOptions.placeholder(i).error(i).centerCrop();
        }
        return avatarOptions;
    }

    @NotNull
    public final RequestOptions getGldieSharedOptions() {
        if (sharedOptions == null) {
            RequestOptions requestOptions = new RequestOptions();
            int i = R.drawable.icon_placeholder;
            sharedOptions = requestOptions.placeholder(i).error(i).centerCrop();
        }
        return sharedOptions;
    }

    @NotNull
    public final RequestOptions getRoundOptions(@NotNull Context context) {
        if (roundOptions == null) {
            RequestOptions requestOptions = new RequestOptions();
            int i = R.drawable.icon_placeholder;
            roundOptions = requestOptions.placeholder(i).error(i).transform(new GlideRoundTransform(context, 10.0f));
        }
        return roundOptions;
    }
}
