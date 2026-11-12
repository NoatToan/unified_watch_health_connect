package com.huami.watch.companion.ecg.ui.adapter;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.ecg.chart.EcgGridView;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.db.entity.EcgTagValue;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.model.EcgListData;
import com.huami.watch.companion.ecg.model.EcgSection;
import com.huami.watch.companion.ecg.ui.adapter.EcgAdapter;
import com.huami.watch.companion.ecg.util.EcgMedicalUtil;
import com.huami.watch.companion.ecg.util.EcgUtils;
import com.huami.watch.util.TimeUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0014R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/adapter/EcgAdapter;", "Lcom/chad/library/adapter/base/BaseSectionQuickAdapter;", "Lcom/huami/watch/companion/ecg/model/EcgSection;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "Lcom/huami/ecg/core/db/entity/EcgData;", "item", "", "b", "Lcom/huami/ecg/core/db/entity/EcgTag;", "tag", "c", "convertHead", "convert", "Lcom/huami/watch/companion/ecg/ui/adapter/EcgAdapter$EcgItemInitScrop;", "a", "Lcom/huami/watch/companion/ecg/ui/adapter/EcgAdapter$EcgItemInitScrop;", "initScope", "<init>", "(Lcom/huami/watch/companion/ecg/ui/adapter/EcgAdapter$EcgItemInitScrop;)V", "EcgItemInitScrop", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgAdapter extends BaseSectionQuickAdapter<EcgSection, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EcgItemInitScrop initScope;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/adapter/EcgAdapter$EcgItemInitScrop;", "", "Landroid/widget/ImageView;", ViewHierarchyConstants.VIEW_KEY, "", "url", "", "playVoiceTag", "Lcom/huami/ecg/core/db/entity/EcgData;", "data", "Lcom/huami/ecg/chart/EcgGridView;", "getFilterRecord", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public interface EcgItemInitScrop {
        void getFilterRecord(@NotNull EcgData data, @NotNull EcgGridView view);

        void playVoiceTag(@NotNull ImageView view, @NotNull String url);
    }

    public EcgAdapter(@NotNull EcgItemInitScrop ecgItemInitScrop) {
        super(R.layout.item_ecg, R.layout.item_ecg_date, null);
        this.initScope = ecgItemInitScrop;
    }

    @SuppressLint({"CheckResult"})
    private final void b(BaseViewHolder helper, EcgData item) {
        this.initScope.getFilterRecord(item, (EcgGridView) helper.getView(R.id.ev_ecg_item));
    }

    private final void c(BaseViewHolder helper, final EcgTag tag) {
        String readableString = EcgUtils.INSTANCE.toReadableString(tag, this.mContext);
        int i = R.id.measure_status;
        helper.setGone(i, !TextUtils.isEmpty(readableString));
        helper.setText(i, readableString);
        helper.setGone(R.id.measure_status_empty, !(tag != null && !tag.hasStringTags()) && TextUtils.isEmpty(readableString));
        int i2 = R.id.measure_voice;
        helper.setGone(i2, tag != null && tag.hasVoiceTag());
        final ImageView imageView = (ImageView) helper.getView(i2);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: vf1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgAdapter.d(tag, this, imageView, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(EcgTag ecgTag, EcgAdapter ecgAdapter, ImageView imageView, View view) {
        EcgTagValue value;
        String str;
        if (ecgTag == null || (value = ecgTag.getValue()) == null || (str = value.getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String()) == null) {
            return;
        }
        ecgAdapter.initScope.playVoiceTag(imageView, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull EcgSection item) {
        EcgData ecg = ((EcgListData) item.t).getEcg();
        b(helper, ecg);
        TextView textView = (TextView) helper.getView(R.id.tv_is_self);
        EcgUtils ecgUtils = EcgUtils.INSTANCE;
        textView.setText(ecgUtils.isSelf(ecg) ? R.string.ecg_data_self : R.string.ecg_data_other);
        helper.setText(R.id.tv_measure_time, TimeUtil.formatDateTime(ecg.getTimestamp() * ((long) 1000), "HH:mm"));
        helper.setText(R.id.hr, this.mContext.getString(R.string.ecg_list_hr, ecgUtils.getHrText(ecg)));
        helper.setText(R.id.hrv_text, this.mContext.getString(R.string.ecg_list_hrv, Integer.valueOf((int) Math.rint(ecgUtils.hrv(ecg)))));
        int i = R.id.tv_afib;
        ecgUtils.formatAFibTag((TextView) helper.getView(i), ecgUtils.getAFib(ecg), ecg.getDeviceSource());
        int i2 = R.id.hrv_faq;
        EcgMedicalUtil ecgMedicalUtil = EcgMedicalUtil.INSTANCE;
        helper.setVisible(i2, !ecgMedicalUtil.getEcgMedicalService().isMedicalSource(ecg.getDeviceSource()));
        helper.addOnClickListener(R.id.hrv);
        helper.setVisible(i, !ecgMedicalUtil.getEcgMedicalService().isMedicalCollectSource(ecg.getDeviceSource()));
        c(helper, ((EcgListData) item.t).getTag());
    }

    @Override // com.chad.library.adapter.base.BaseSectionQuickAdapter
    public void convertHead(@NotNull BaseViewHolder helper, @NotNull EcgSection item) {
        helper.setText(R.id.ecg_date, item.header);
    }
}
