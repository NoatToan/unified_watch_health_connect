package com.huami.pai.converter;

import com.huami.pai.db.po.FitnessAge;
import com.huami.pai.web.bean.FitnessAgeBean;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/pai/web/bean/FitnessAgeBean;", "Lcom/huami/pai/db/po/FitnessAge;", "toFitnessAge", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class WebBeanToPoKt {
    @NotNull
    public static final FitnessAge toFitnessAge(@NotNull FitnessAgeBean fitnessAgeBean) {
        return new FitnessAge(new Date(fitnessAgeBean.getCalendarDay()), fitnessAgeBean.getFitnessAge(), fitnessAgeBean.getVo2max(), fitnessAgeBean.getSource());
    }
}
