package com.huami.moving.ui.view.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.moving.R;
import com.huami.moving.ui.utils.BitmapUtils;
import com.huami.moving.ui.utils.RunnerPeripheralInfo;
import com.huami.moving.ui.view.FastSlowGradientView;
import com.huami.moving.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¨\u0006\u0018"}, d2 = {"Lcom/huami/moving/ui/view/card/EndCardOverView;", "Landroidx/cardview/widget/CardView;", "Lcom/huami/moving/ui/utils/RunnerPeripheralInfo;", "info", "Landroid/widget/ImageView;", ViewHierarchyConstants.VIEW_KEY, "", "a", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "", TdmillHmFragment.ARG_IS_METRIC, "isAmap", "setData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class EndCardOverView extends CardView {
    public EndCardOverView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.sport_end_card_over_view, this);
        RunnerPeripheralInfo runnerPeripheralInfo = RunnerPeripheralInfo.getInstance();
        a(runnerPeripheralInfo, (ImageView) findViewById(R.id.end_card_view_avatar));
        TypefaceTextView typefaceTextView = (TypefaceTextView) findViewById(R.id.end_card_view_nick_name);
        String name = runnerPeripheralInfo.getName();
        typefaceTextView.setText(name == null ? "" : name);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    private final void a(RunnerPeripheralInfo info, ImageView view) {
        String avatarUrl;
        String avatarPath = info.getAvatarPath();
        if (avatarPath != null) {
            if (!new File(avatarPath).exists()) {
                avatarPath = null;
            }
            if (avatarPath == null) {
                avatarPath = null;
            } else {
                BitmapUtils.displayRoundImage(getContext(), avatarPath, view);
            }
        } else {
            avatarPath = null;
        }
        if (avatarPath != null || (avatarUrl = info.getAvatarUrl()) == null) {
            return;
        }
        String str = m.isBlank(avatarUrl) ? null : avatarUrl;
        if (str == null) {
            return;
        }
        BitmapUtils.displayRoundImage(getContext(), str, view);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void setData(@NotNull Trackrecord record, boolean isMetric, boolean isAmap) {
        ((TypefaceTextView) findViewById(R.id.end_card_view_start_time)).setText(new SimpleDateFormat("yyyy/M/d HH:mm:ss", Locale.ENGLISH).format(new Date(record.getTrackid().longValue() * ((long) 1000))));
        CardInfoAdapter cardInfoAdapter = new CardInfoAdapter(getContext(), record, isMetric, true);
        List<Pair<String, String>> data = cardInfoAdapter.getData();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (i < 6) {
                arrayList.add(obj);
            }
            i = i2;
        }
        cardInfoAdapter.setData(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
        int i3 = R.id.end_card_view_info;
        ((RecyclerView) findViewById(i3)).setLayoutManager(new GridLayoutManager(getContext(), 3));
        ((RecyclerView) findViewById(i3)).setAdapter(cardInfoAdapter);
        ((RecyclerView) findViewById(i3)).setNestedScrollingEnabled(false);
        String string = getContext().getString(R.string.over_view_watermark_format, Utils.appName(), cardInfoAdapter.getPostfix());
        TextView textView = (TextView) findViewById(R.id.end_card_view_sport_type);
        textView.setVisibility(0);
        textView.setText(string);
        String[] mainContent = cardInfoAdapter.getMainContent();
        ((TypefaceTextView) findViewById(R.id.end_card_view_main_value)).setText(mainContent[0]);
        ((TypefaceTextView) findViewById(R.id.end_card_view_main_unit)).setText(getContext().getString(Integer.parseInt(mainContent[1])));
        if (cardInfoAdapter.getIsOutdoor() && isAmap) {
            ((FastSlowGradientView) findViewById(R.id.end_card_view_gradient)).setVisibility(0);
        }
    }

    public EndCardOverView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EndCardOverView(@NotNull Context context) {
        this(context, null);
    }
}
