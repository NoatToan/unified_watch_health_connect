package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.cji;
import defpackage.eui;
import defpackage.fli;
import defpackage.s8p;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001-B=\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u001e\u0010%\u001a\u001a\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0#¢\u0006\u0004\b+\u0010,J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\nR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R:\u0010%\u001a\u001a\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkAdapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/BaseTalkAdapter;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$d0;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lkotlin/Pair;", "getHighlightOffset", "()Lkotlin/Pair;", "getTargetPosition", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkBean;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "Lkotlin/Function3;", "", "onItemClick", "Lkotlin/jvm/functions/Function3;", "getOnItemClick", "()Lkotlin/jvm/functions/Function3;", "setOnItemClick", "(Lkotlin/jvm/functions/Function3;)V", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "TalkItemViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTalkAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TalkAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1872#2,3:138\n1872#2,3:141\n*S KotlinDebug\n*F\n+ 1 TalkAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkAdapter\n*L\n116#1:138,3\n125#1:141,3\n*E\n"})
public final class TalkAdapter extends BaseTalkAdapter {

    @NotNull
    private Context context;

    @NotNull
    private List<TalkBean> dataList;

    @NotNull
    private Function3<? super Boolean, ? super Integer, ? super Integer, Unit> onItemClick;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkAdapter$TalkItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkBean;", "talkBean", "", "position", "", "bindData", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkBean;I)V", "Landroid/widget/TextView;", "textview", "Landroid/widget/TextView;", "getTextview", "()Landroid/widget/TextView;", "setTextview", "(Landroid/widget/TextView;)V", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkAdapter;Landroid/widget/TextView;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nTalkAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TalkAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkAdapter$TalkItemViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1872#2,3:138\n*S KotlinDebug\n*F\n+ 1 TalkAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkAdapter$TalkItemViewHolder\n*L\n71#1:138,3\n*E\n"})
    public final class TalkItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private TextView textview;
        final /* synthetic */ TalkAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TalkItemViewHolder(@NotNull TalkAdapter talkAdapter, TextView textview) {
            super(textview);
            Intrinsics.checkNotNullParameter(textview, "textview");
            this.this$0 = talkAdapter;
            this.textview = textview;
        }

        public final void bindData(@NotNull TalkBean talkBean, final int position) {
            Intrinsics.checkNotNullParameter(talkBean, "talkBean");
            String str = talkBean.getUserName().length() > 0 ? talkBean.getUserName() + "：" : "";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Iterator<MessageBean> it = talkBean.getMsgList().iterator();
            while (it.hasNext()) {
                sb.append(it.next().getContent());
            }
            SpannableString spannableString = new SpannableString(sb.toString());
            final TalkAdapter talkAdapter = this.this$0;
            final int i = 0;
            spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.TalkAdapter$TalkItemViewHolder$bindData$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    talkAdapter.getOnItemClick().invoke(Boolean.TRUE, Integer.valueOf(position), -1);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setUnderlineText(false);
                }
            }, 0, str.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#888888")), 0, str.length(), 33);
            int length = str.length();
            List<MessageBean> msgList = talkBean.getMsgList();
            final TalkAdapter talkAdapter2 = this.this$0;
            for (Object obj : msgList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int length2 = ((MessageBean) obj).getContent().length() + length;
                spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.TalkAdapter$TalkItemViewHolder$bindData$2$1
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        talkAdapter2.getOnItemClick().invoke(Boolean.FALSE, Integer.valueOf(position), Integer.valueOf(i));
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint ds) {
                        Intrinsics.checkNotNullParameter(ds, "ds");
                        super.updateDrawState(ds);
                        ds.setUnderlineText(false);
                    }
                }, length, length2, 33);
                if (talkAdapter2.getCurPosition() == position && talkAdapter2.getCurIndex() == i) {
                    spannableString.setSpan(new ForegroundColorSpan(ExtUtilsKt.getColor(cji.d)), length, length2, 33);
                } else {
                    spannableString.setSpan(new ForegroundColorSpan(ExtUtilsKt.getColor(cji.D)), length, length2, 33);
                }
                length = length2;
                i = i2;
            }
            s8p.m(this.textview, ExtUtilsKt.getDimension(fli.f17899a));
            this.textview.setText(spannableString);
            this.textview.setMovementMethod(LinkMovementMethod.getInstance());
        }

        @NotNull
        public final TextView getTextview() {
            return this.textview;
        }

        public final void setTextview(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.textview = textView;
        }
    }

    public TalkAdapter(@NotNull Context context, @NotNull List<TalkBean> dataList, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.context = context;
        this.dataList = dataList;
        this.onItemClick = onItemClick;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<TalkBean> getDataList() {
        return this.dataList;
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.BaseTalkAdapter
    @NotNull
    public Pair<Integer, Integer> getHighlightOffset() {
        int length = 0;
        if (getCurPosition() < 0 || getCurPosition() >= this.dataList.size() || getCurIndex() < 0 || getCurIndex() >= this.dataList.get(getCurPosition()).getMsgList().size()) {
            return new Pair<>(0, 0);
        }
        Pair pair = new Pair(0, 0);
        List<MessageBean> msgList = this.dataList.get(getCurPosition()).getMsgList();
        int curIndex = getCurIndex() + 1;
        List<MessageBean> list = msgList;
        int length2 = 0;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            MessageBean messageBean = (MessageBean) obj;
            if (i < getCurIndex()) {
                length2 += messageBean.getContent().length();
            }
            i = i2;
        }
        Pair pairCopy$default = Pair.copy$default(pair, Integer.valueOf(length2), null, 2, null);
        int i3 = 0;
        for (Object obj2 : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            MessageBean messageBean2 = (MessageBean) obj2;
            if (i3 < curIndex) {
                length += messageBean2.getContent().length();
            }
            i3 = i4;
        }
        return Pair.copy$default(pairCopy$default, null, Integer.valueOf(length), 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @NotNull
    public final Function3<Boolean, Integer, Integer, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.BaseTalkAdapter
    public int getTargetPosition() {
        return getCurPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((TalkItemViewHolder) holder).bindData(this.dataList.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(eui.V1, parent, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        return new TalkItemViewHolder(this, (TextView) viewInflate);
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<TalkBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setOnItemClick(@NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.onItemClick = function3;
    }
}
