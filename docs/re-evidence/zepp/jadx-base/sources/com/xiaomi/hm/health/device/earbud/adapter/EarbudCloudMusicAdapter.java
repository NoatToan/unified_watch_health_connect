package com.xiaomi.hm.health.device.earbud.adapter;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.xiaomi.hm.health.device.earbud.service.MusicDownloadStatus;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH\u0016R.\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudCloudMusicAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfo;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "convert", "", "data", "setNewData", "Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", "value", "a", "Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", "getDownloadProgress", "()Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", "setDownloadProgress", "(Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;)V", "downloadProgress", "", "b", "J", "getAuditionId", "()J", "setAuditionId", "(J)V", "auditionId", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "mProgressText", "Landroid/widget/ProgressBar;", GoogleApiAvailabilityLight.a, "Landroid/widget/ProgressBar;", "mProgressBar", "e", "Ljava/lang/Long;", "mCurrentDownloadId", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudCloudMusicAdapter extends BaseQuickAdapter<EarbudMusicInfo, BaseViewHolder> {
    public static final int BREATH_ID = 67;

    @NotNull
    private static final List<Integer> f = e.listOf(67);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private MusicDownloadStatus downloadProgress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long auditionId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TextView mProgressText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ProgressBar mProgressBar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Long mCurrentDownloadId;

    public EarbudCloudMusicAdapter() {
        super(R.layout.item_earbud_cloud_music, null);
        this.auditionId = -1L;
    }

    public final long getAuditionId() {
        return this.auditionId;
    }

    @Nullable
    public final MusicDownloadStatus getDownloadProgress() {
        return this.downloadProgress;
    }

    public final void setAuditionId(long j) {
        this.auditionId = j;
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
            Long l = this.mCurrentDownloadId;
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
        Long l2 = this.mCurrentDownloadId;
        if (musicDownloadStatus != null && l2 != null && l2.longValue() == musicDownloadStatus.getId()) {
            Progress progress3 = musicDownloadStatus.getProgress();
            if (!(progress3 != null && progress3.total == 0) && (progress2 = musicDownloadStatus.getProgress()) != null) {
                i = progress2.total;
            }
        }
        progressBar.setMax(i);
        Long l3 = this.mCurrentDownloadId;
        if (musicDownloadStatus != null && l3 != null && l3.longValue() == musicDownloadStatus.getId() && (progress = musicDownloadStatus.getProgress()) != null) {
            i2 = progress.progress;
        }
        progressBar.setProgress(i2);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewData(@Nullable List<EarbudMusicInfo> data) {
        this.mProgressText = null;
        this.mProgressBar = null;
        super.setNewData(data);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0193  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull EarbudMusicInfo item) {
        Drawable drawable;
        CharSequence charSequence;
        int i;
        BigDecimal bigDecimal;
        int status;
        Progress progress;
        Progress progress2;
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(this.mContext).load(item.getBanner());
        int i2 = R.drawable.bg_default_cloud_music;
        requestBuilderLoad.apply(RequestOptions.placeholderOf(i2).error(i2)).into((ImageView) helper.getView(R.id.bg_view));
        int i3 = R.id.music_play;
        long j = this.auditionId;
        Long id = item.getId();
        helper.setGone(i3, id != null && j == id.longValue());
        Drawable drawable2 = ((ImageView) helper.getView(i3)).getDrawable();
        Objects.requireNonNull(drawable2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable2;
        long j2 = this.auditionId;
        Long id2 = item.getId();
        if (id2 != null && j2 == id2.longValue()) {
            animationDrawable.start();
        } else {
            animationDrawable.stop();
        }
        if (f.contains(Integer.valueOf((int) item.getId().longValue()))) {
            long j3 = this.auditionId;
            Long id3 = item.getId();
            if (id3 != null && j3 == id3.longValue()) {
                SpannableString spannableString = new SpannableString(item.getName());
                spannableString.setSpan(new UnderlineSpan(), 0, item.getName().length(), 0);
                drawable = ContextCompat.getDrawable(this.mContext, R.drawable.ic_earbud_breath_desc);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                charSequence = spannableString;
            } else {
                String name = item.getName();
                helper.setText(R.id.music_name, item.getName());
                drawable = null;
                charSequence = name;
            }
        } else {
            String name2 = item.getName();
            helper.setText(R.id.music_name, item.getName());
            drawable = null;
            charSequence = name2;
        }
        int i4 = R.id.music_name;
        TextView textView = (TextView) helper.getView(i4);
        textView.setText(charSequence);
        textView.setCompoundDrawables(null, null, drawable, null);
        Integer localStatus = item.getLocalStatus();
        int iIntValue = localStatus == null ? 0 : localStatus.intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            helper.setGone(R.id.download_progress, false);
            helper.setGone(R.id.download_status, false);
            helper.setGone(R.id.download_percent, false);
            helper.setGone(R.id.local_status, false);
            helper.setGone(R.id.download_btn, true);
        } else if (iIntValue == 1) {
            helper.setGone(R.id.download_progress, false);
            int i5 = R.id.download_status;
            helper.setGone(i5, true);
            helper.setGone(R.id.download_percent, false);
            helper.setText(i5, R.string.earbud_music_wait_download);
            helper.setGone(R.id.local_status, false);
            helper.setGone(R.id.download_btn, false);
        } else if (iIntValue == 2) {
            int i6 = R.id.download_percent;
            this.mProgressText = (TextView) helper.getView(i6);
            int i7 = R.id.download_progress;
            this.mProgressBar = (ProgressBar) helper.getView(i7);
            this.mCurrentDownloadId = item.getId();
            helper.setGone(i7, true);
            helper.setGone(R.id.download_status, false);
            helper.setGone(i6, true);
            helper.setGone(R.id.download_btn, false);
            MusicDownloadStatus musicDownloadStatus = this.downloadProgress;
            Long id4 = item.getId();
            int i8 = (musicDownloadStatus == null || id4 == null || id4.longValue() != musicDownloadStatus.getId() || (progress2 = musicDownloadStatus.getProgress()) == null) ? 0 : progress2.progress;
            MusicDownloadStatus musicDownloadStatus2 = this.downloadProgress;
            Long id5 = item.getId();
            if (musicDownloadStatus2 == null || id5 == null || id5.longValue() != musicDownloadStatus2.getId()) {
                i = 100;
            } else {
                Progress progress3 = musicDownloadStatus2.getProgress();
                if ((progress3 != null && progress3.total == 0) || (progress = musicDownloadStatus2.getProgress()) == null) {
                    i = 100;
                } else {
                    i = progress.total;
                }
            }
            helper.setProgress(i7, i8, i);
            Context context = this.mContext;
            int i9 = R.string.earbud_music_progress;
            Object[] objArr = new Object[1];
            MusicDownloadStatus musicDownloadStatus3 = this.downloadProgress;
            Long id6 = item.getId();
            if (musicDownloadStatus3 == null || id6 == null || musicDownloadStatus3.getId() != id6.longValue() || (status = musicDownloadStatus3.getStatus()) == 0) {
                bigDecimal = new BigDecimal(0);
            } else if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, -1}).contains(Integer.valueOf(status))) {
                bigDecimal = (musicDownloadStatus3.getProgress() == null || musicDownloadStatus3.getProgress().progress == 0 || musicDownloadStatus3.getProgress().total == 0) ? new BigDecimal(0) : new BigDecimal(((double) (musicDownloadStatus3.getProgress().progress * 100)) / ((double) musicDownloadStatus3.getProgress().total)).setScale(1, 4);
            } else {
                bigDecimal = new BigDecimal(100);
            }
            objArr[0] = bigDecimal.toString();
            helper.setText(i6, context.getString(i9, objArr));
            helper.setGone(R.id.local_status, false);
        } else if (iIntValue == 3) {
            helper.setGone(R.id.download_progress, false);
            helper.setGone(R.id.download_status, false);
            helper.setGone(R.id.download_percent, false);
            helper.setGone(R.id.local_status, true);
            helper.setGone(R.id.download_btn, false);
        }
        helper.addOnClickListener(R.id.download_btn);
        helper.addOnClickListener(i4);
    }
}
