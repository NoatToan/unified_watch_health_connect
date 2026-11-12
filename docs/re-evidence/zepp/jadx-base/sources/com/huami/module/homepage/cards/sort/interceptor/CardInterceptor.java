package com.huami.module.homepage.cards.sort.interceptor;

import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.module.homepage.cards.sort.db.CardSequence;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/module/homepage/cards/sort/interceptor/CardInterceptor;", "", "interceptor", "", "setInterceptor$homePage_release", "(Lcom/huami/module/homepage/cards/sort/interceptor/CardInterceptor;)V", "setInterceptor", "getInterceptor$homePage_release", "()Lcom/huami/module/homepage/cards/sort/interceptor/CardInterceptor;", "getInterceptor", "", "Lcom/huami/module/homepage/cards/sort/db/CardSequence;", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "handleInterceptor", "a", "Lcom/huami/module/homepage/cards/sort/interceptor/CardInterceptor;", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public abstract class CardInterceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private CardInterceptor interceptor;

    @Nullable
    /* JADX INFO: renamed from: getInterceptor$homePage_release, reason: from getter */
    public final CardInterceptor getInterceptor() {
        return this.interceptor;
    }

    @NotNull
    public abstract List<CardSequence> handleInterceptor(@NotNull List<CardSequence> cards);

    public final void setInterceptor$homePage_release(@NotNull CardInterceptor interceptor) {
        this.interceptor = interceptor;
    }
}
