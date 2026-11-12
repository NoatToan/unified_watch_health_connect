package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.utils.dg;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class InteractCfg implements Serializable {
    private static final int DEFAULT_TWIST_ACC = 15;
    private static final int DEFAULT_TWIST_DEGREE = 35;
    private static final int MIN_TWIST_ACC = 10;
    private static final long serialVersionUID = 9151867350505964337L;
    private Integer interactiveLogic;
    private Integer splashAdTagClickableType;
    private Integer splashInteractCfg;
    private String splashRedirectTxt;
    private String swipeClkTxt;
    private Integer swipeDirection;
    private Integer swipeDp;
    private String swipeTxt;
    private Integer twistAcc;
    private String twistClkTxt;
    private Integer twistDegree;
    private String twistTxt;

    public String l() {
        return dg.e(this.splashRedirectTxt);
    }

    public String k() {
        return dg.e(this.twistClkTxt);
    }

    public String j() {
        return dg.e(this.swipeClkTxt);
    }

    public String i() {
        return dg.e(this.twistTxt);
    }

    public String h() {
        return dg.e(this.swipeTxt);
    }

    public void g(Integer num) {
        this.swipeDirection = num;
    }

    public Integer g() {
        Integer num = this.swipeDirection;
        if (num == null || !(num.intValue() == 0 || this.swipeDirection.intValue() == 1)) {
            return 0;
        }
        return this.swipeDirection;
    }

    public void f(Integer num) {
        this.twistDegree = num;
    }

    public Integer f() {
        return this.splashAdTagClickableType;
    }

    public void e(String str) {
        this.splashRedirectTxt = str;
    }

    public void e(Integer num) {
        this.twistAcc = num;
    }

    public Integer e() {
        Integer num = this.interactiveLogic;
        if (num == null) {
            return 0;
        }
        return num;
    }

    public void d(String str) {
        this.twistClkTxt = str;
    }

    public void d(Integer num) {
        this.swipeDp = num;
    }

    public Integer d() {
        Integer num = this.twistDegree;
        int iIntValue = 35;
        if (num != null && num.intValue() >= 35) {
            iIntValue = this.twistDegree.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public void c(String str) {
        this.swipeClkTxt = str;
    }

    public void c(Integer num) {
        this.splashAdTagClickableType = num;
    }

    public Integer c() {
        Integer num = this.twistAcc;
        return Integer.valueOf((num == null || num.intValue() < 10) ? 15 : this.twistAcc.intValue());
    }

    public void b(String str) {
        this.twistTxt = str;
    }

    public void b(Integer num) {
        this.interactiveLogic = num;
    }

    public Integer b() {
        return this.swipeDp;
    }

    public void a(String str) {
        this.swipeTxt = str;
    }

    public void a(Integer num) {
        this.splashInteractCfg = num;
    }

    public Integer a() {
        Integer num = this.splashInteractCfg;
        if (num == null || (num.intValue() >= 0 && this.splashInteractCfg.intValue() <= 4)) {
            return this.splashInteractCfg;
        }
        return 0;
    }
}
