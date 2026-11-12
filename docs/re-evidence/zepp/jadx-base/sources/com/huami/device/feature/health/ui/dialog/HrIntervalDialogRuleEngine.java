package com.huami.device.feature.health.ui.dialog;

import com.huami.device.feature.health.ui.model.DialogParams;
import com.huami.device.feature.health.ui.model.IIntervalDialogRule;
import com.huami.device.feature.health.ui.model.IntervalExp;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/device/feature/health/ui/dialog/HrIntervalDialogRuleEngine;", "", "Lcom/huami/device/feature/health/ui/model/IIntervalDialogRule;", "rule", "addRule", "Lcom/huami/device/feature/health/ui/model/IntervalExp;", "expression", "Lcom/huami/device/feature/health/ui/model/DialogParams;", "process", "", "a", "Ljava/util/List;", "rules", "<init>", "()V", "Companion", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HrIntervalDialogRuleEngine {

    @NotNull
    private static final String b = "HrIntervalDialogRuleEngine";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<IIntervalDialogRule> rules = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ IntervalExp a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IntervalExp intervalExp) {
            super(0);
            this.a = intervalExp;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "process expression: " + this.a;
        }
    }

    @NotNull
    public final HrIntervalDialogRuleEngine addRule(@NotNull IIntervalDialogRule rule) {
        this.rules.add(rule);
        return this;
    }

    @Nullable
    public final DialogParams process(@NotNull IntervalExp expression) {
        Object next;
        HMLog.info(b, new a(expression));
        Iterator<T> it2 = this.rules.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((IIntervalDialogRule) next).evaluate(expression));
        IIntervalDialogRule iIntervalDialogRule = (IIntervalDialogRule) next;
        if (iIntervalDialogRule == null) {
            return null;
        }
        return iIntervalDialogRule.process(expression);
    }
}
