package com.xiaomi.hm.health.device.earbud.adapter;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.watch.util.I18nUtil;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.xiaomi.hm.health.device.earbud.service.MusicDownloadStatus;
import com.xiaomi.hm.health.device.earbud.viewmodel.DeviceMusicSection;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\u0018\u0010\u000b\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0016R*\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001f\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR.\u0010'\u001a\u0004\u0018\u00010 2\b\u0010\r\u001a\u0004\u0018\u00010 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudDeviceMusicAdapter;", "Lcom/chad/library/adapter/base/BaseSectionQuickAdapter;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/DeviceMusicSection;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "convertHead", "convert", "", "data", "setNewData", "", "value", "a", "J", "getCurrentMusicId", "()J", "setCurrentMusicId", "(J)V", "currentMusicId", "", "b", "Z", "isPlaying", "()Z", "setPlaying", "(Z)V", "c", "getShowDelete", "setShowDelete", "showDelete", "Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", "getDownloadProgress", "()Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", "setDownloadProgress", "(Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;)V", "downloadProgress", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "mProgressText", "Landroid/widget/ProgressBar;", "f", "Landroid/widget/ProgressBar;", "mProgressBar", "g", "Ljava/lang/Long;", "mCurrentDownloadingId", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudDeviceMusicAdapter extends BaseSectionQuickAdapter<DeviceMusicSection, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long currentMusicId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isPlaying;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean showDelete;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private MusicDownloadStatus downloadProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private TextView mProgressText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private ProgressBar mProgressBar;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Long mCurrentDownloadingId;

    public EarbudDeviceMusicAdapter() {
        super(R.layout.item_earbud_device_music, R.layout.item_earbud_device_music_title, null);
    }

    @Override // com.chad.library.adapter.base.BaseSectionQuickAdapter
    public void convertHead(@NotNull BaseViewHolder helper, @NotNull DeviceMusicSection item) {
    }

    public final long getCurrentMusicId() {
        return this.currentMusicId;
    }

    @Nullable
    public final MusicDownloadStatus getDownloadProgress() {
        return this.downloadProgress;
    }

    public final boolean getShowDelete() {
        return this.showDelete;
    }

    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public final void setCurrentMusicId(long j) {
        this.currentMusicId = j;
        notifyDataSetChanged();
    }

    public final void setDownloadProgress(@Nullable MusicDownloadStatus musicDownloadStatus) {
        Progress progress;
        Progress progress2;
        BigDecimal bigDecimal;
        int status;
        this.downloadProgress = musicDownloadStatus;
        TextView textView = this.mProgressText;
        int i = 100;
        int i2 = 0;
        if (textView != null) {
            Context context = this.mContext;
            int i3 = R.string.earbud_music_progress;
            Object[] objArr = new Object[1];
            Long l = this.mCurrentDownloadingId;
            if (musicDownloadStatus == null || l == null || musicDownloadStatus.getId() != l.longValue() || (status = musicDownloadStatus.getStatus()) == 0) {
                bigDecimal = new BigDecimal(0);
            } else if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, -1}).contains(Integer.valueOf(status))) {
                bigDecimal = (musicDownloadStatus.getProgress() == null || musicDownloadStatus.getProgress().progress == 0 || musicDownloadStatus.getProgress().total == 0) ? new BigDecimal(0) : new BigDecimal(((double) (musicDownloadStatus.getProgress().progress * 100)) / ((double) musicDownloadStatus.getProgress().total)).setScale(1, 4);
            } else {
                bigDecimal = new BigDecimal(100);
            }
            objArr[0] = bigDecimal.toString();
            textView.setText(context.getString(i3, objArr));
        }
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar == null) {
            return;
        }
        Long l2 = this.mCurrentDownloadingId;
        if (musicDownloadStatus != null && l2 != null && l2.longValue() == musicDownloadStatus.getId()) {
            Progress progress3 = musicDownloadStatus.getProgress();
            if (!(progress3 != null && progress3.total == 0) && (progress2 = musicDownloadStatus.getProgress()) != null) {
                i = progress2.total;
            }
        }
        progressBar.setMax(i);
        Long l3 = this.mCurrentDownloadingId;
        if (musicDownloadStatus != null && l3 != null && l3.longValue() == musicDownloadStatus.getId() && (progress = musicDownloadStatus.getProgress()) != null) {
            i2 = progress.progress;
        }
        progressBar.setProgress(i2);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewData(@Nullable List<DeviceMusicSection> data) {
        this.mProgressText = null;
        this.mProgressBar = null;
        super.setNewData(data);
    }

    public final void setPlaying(boolean z) {
        this.isPlaying = z;
        notifyDataSetChanged();
    }

    public final void setShowDelete(boolean z) {
        this.showDelete = z;
        notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0272  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull DeviceMusicSection item) {
        char c;
        BigDecimal bigDecimal;
        int i;
        Progress progress;
        Progress progress2;
        helper.setText(R.id.music_name, ((EarbudMusicInfo) item.t).getName());
        int i2 = R.id.music_play;
        long j = this.currentMusicId;
        Long id = ((EarbudMusicInfo) item.t).getId();
        helper.setGone(i2, (id == null || j != id.longValue() || this.showDelete) ? false : true);
        RoundedCorners roundedCorners = new RoundedCorners(20);
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(this.mContext).load(((EarbudMusicInfo) item.t).getThumb());
        int i3 = R.drawable.bg_default_device_music;
        requestBuilderLoad.apply(RequestOptions.placeholderOf(i3).error(i3).transform(roundedCorners)).into((ImageView) helper.getView(R.id.bg_view));
        long j2 = this.currentMusicId;
        Long id2 = ((EarbudMusicInfo) item.t).getId();
        if (id2 != null && j2 == id2.longValue()) {
            Drawable drawable = ((ImageView) helper.getView(i2)).getDrawable();
            Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            if (this.isPlaying) {
                animationDrawable.start();
            } else {
                animationDrawable.stop();
            }
        }
        if (((EarbudMusicInfo) item.t).getOfficialBuiltin().booleanValue()) {
            helper.setGone(R.id.download_status, false);
            helper.setGone(R.id.download_progress, false);
        }
        int i4 = R.id.music_delete;
        helper.setGone(i4, this.showDelete && (!((EarbudMusicInfo) item.t).getOfficialBuiltin().booleanValue() || CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 1}).contains(((EarbudMusicInfo) item.t).getLocalStatus())));
        helper.addOnClickListener(i4);
        int i5 = R.id.download_progress;
        Integer localStatus = ((EarbudMusicInfo) item.t).getLocalStatus();
        helper.setGone(i5, localStatus != null && localStatus.intValue() == 2);
        int i6 = R.id.music_size;
        Integer localStatus2 = ((EarbudMusicInfo) item.t).getLocalStatus();
        helper.setGone(i6, localStatus2 != null && localStatus2.intValue() == 3 && this.showDelete);
        Integer localStatus3 = ((EarbudMusicInfo) item.t).getLocalStatus();
        if (localStatus3 == null || localStatus3.intValue() != 2) {
            Integer localStatus4 = ((EarbudMusicInfo) item.t).getLocalStatus();
            if (localStatus4 != null && localStatus4.intValue() == 1) {
                int i7 = R.id.download_status;
                helper.setText(i7, R.string.earbud_music_wait_download);
                helper.setGone(i7, true);
                helper.setGone(i5, false);
                helper.setGone(R.id.download_percent, false);
                return;
            }
            helper.setGone(R.id.download_status, false);
            helper.setGone(i5, false);
            helper.setGone(R.id.download_percent, false);
            if (((EarbudMusicInfo) item.t).getOfficialBuiltin().booleanValue()) {
                helper.setText(i6, R.string.earbud_music_type_factory);
                return;
            } else {
                helper.setGone(i6, false);
                return;
            }
        }
        int i8 = R.id.download_percent;
        this.mProgressText = (TextView) helper.getView(i8);
        this.mProgressBar = (ProgressBar) helper.getView(i5);
        this.mCurrentDownloadingId = ((EarbudMusicInfo) item.t).getId();
        helper.setGone(R.id.download_status, false);
        helper.setGone(i5, I18nUtil.isZh(this.mContext));
        helper.setGone(i8, true);
        Context context = this.mContext;
        int i9 = R.string.earbud_music_progress;
        Object[] objArr = new Object[1];
        MusicDownloadStatus musicDownloadStatus = this.downloadProgress;
        Long id3 = ((EarbudMusicInfo) item.t).getId();
        if (musicDownloadStatus == null || id3 == null || musicDownloadStatus.getId() != id3.longValue()) {
            i9 = i9;
            c = 0;
            bigDecimal = new BigDecimal(0);
        } else {
            int status = musicDownloadStatus.getStatus();
            if (status == 0) {
                bigDecimal = new BigDecimal(0);
            } else if (!CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, -1}).contains(Integer.valueOf(status))) {
                i9 = i9;
                c = 0;
                bigDecimal = new BigDecimal(100);
            } else if (musicDownloadStatus.getProgress() == null || musicDownloadStatus.getProgress().progress == 0 || musicDownloadStatus.getProgress().total == 0) {
                i9 = i9;
                c = 0;
                bigDecimal = new BigDecimal(0);
            } else {
                bigDecimal = new BigDecimal(((double) (musicDownloadStatus.getProgress().progress * 100)) / ((double) musicDownloadStatus.getProgress().total)).setScale(1, 4);
            }
            c = 0;
        }
        objArr[c] = bigDecimal.toString();
        helper.setText(i8, context.getString(i9, objArr));
        MusicDownloadStatus musicDownloadStatus2 = this.downloadProgress;
        Long id4 = ((EarbudMusicInfo) item.t).getId();
        int i10 = (musicDownloadStatus2 == null || id4 == null || id4.longValue() != musicDownloadStatus2.getId() || (progress2 = musicDownloadStatus2.getProgress()) == null) ? 0 : progress2.progress;
        MusicDownloadStatus musicDownloadStatus3 = this.downloadProgress;
        Long id5 = ((EarbudMusicInfo) item.t).getId();
        if (musicDownloadStatus3 == null || id5 == null || id5.longValue() != musicDownloadStatus3.getId()) {
            i = 100;
        } else {
            Progress progress3 = musicDownloadStatus3.getProgress();
            if ((progress3 != null && progress3.total == 0) || (progress = musicDownloadStatus3.getProgress()) == null) {
                i = 100;
            } else {
                i = progress.total;
            }
        }
        helper.setProgress(i5, i10, i);
    }
}
