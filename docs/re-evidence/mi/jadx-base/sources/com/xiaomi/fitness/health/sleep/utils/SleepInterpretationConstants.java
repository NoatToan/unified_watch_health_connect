package com.xiaomi.fitness.health.sleep.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b0\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/utils/SleepInterpretationConstants;", "", "<init>", "()V", "URL_DEFAULT", "", "URL_ZH_CN", "URL_ZH_CH_V1", "URL_ZH_HK", "URL_ZH_HK_V1", "URL_ZH_TW", "URL_ZH_TW_V1", "URL_UG_CN", "URL_BO_CN", "URL_BG_BG", "URL_AR", "URL_CS", "URL_DA", "URL_DE", "URL_EL", "URL_EN_AU", "URL_EN_GB", "URL_EN_IN", "URL_ES", "URL_ES_V1", "URL_ET_EE", "URL_FI", "URL_FR", "URL_HI", "URL_HR", "URL_HU", "URL_IN", "URL_IT", "URL_IW_IL", "URL_JA", "URL_KO", "URL_LT", "URL_LV", "URL_NB", "URL_NL", "URL_PL", "URL_PT_BR", "URL_PT_PT", "URL_RO", "URL_RU", "URL_SK", "URL_SL", "URL_SR", "URL_SV", "URL_TH", "URL_TR", "URL_UK", "URL_VI", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepInterpretationConstants {

    @NotNull
    public static final SleepInterpretationConstants INSTANCE = new SleepInterpretationConstants();

    @NotNull
    public static final String URL_AR = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_ar.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=N/ydx99L/LOR3zuHibEUp2yrglE=";

    @NotNull
    public static final String URL_BG_BG = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_bg_bg.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=PHswuM3htjhoUpTKjEMe7YXKDuQ=";

    @NotNull
    public static final String URL_BO_CN = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_bo_cn.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=YSmdDIbkNBwRz3aPNt5zWiR0rUA=";

    @NotNull
    public static final String URL_CS = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_cs.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=qrpF3M1xT6iu73rN30MmDGbvd3c=";

    @NotNull
    public static final String URL_DA = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_da.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=VJhlYu3rPfRZfcsZ5wp/+RUhf+A=";

    @NotNull
    public static final String URL_DE = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_de.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=hpbghRpBkbIE6pDvIONdsBiw/8E=";

    @NotNull
    public static final String URL_DEFAULT = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=VRDbUuHRPG2eb7jWfyzwlecO1Qk=";

    @NotNull
    public static final String URL_EL = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_el.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=OF+tiImmB0A0bB7iqc+zLKf2g7w=";

    @NotNull
    public static final String URL_EN_AU = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_en_au.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=4XpBrPLmcxDChKhzoYKv34eCSUg=";

    @NotNull
    public static final String URL_EN_GB = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_en_gb.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=t8VXlmAtp9WLH9PXPyq5Qfk43U8=";

    @NotNull
    public static final String URL_EN_IN = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_en_in.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=u/rYiHHtlDK0cVBWDbHQSwWtBSo=";

    @NotNull
    public static final String URL_ES = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_es.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=sn7szaoOd+d0K4w3Ax1WgGiMNoE=";

    @NotNull
    public static final String URL_ES_V1 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_es_v1.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=AUEWcw/DEm9uiF6yAsnnTOUQ3Pk=";

    @NotNull
    public static final String URL_ET_EE = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_et_ee.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=JIfM0e/ABQLz1ZWusQiSc+dtFMk=";

    @NotNull
    public static final String URL_FI = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_fi.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=p9aO3aLFrXl3OXAf2vXOWMj+oI0=";

    @NotNull
    public static final String URL_FR = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_fr.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=auoai+7C4PL6xFs+JxRWyEHznF4=";

    @NotNull
    public static final String URL_HI = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_hi_in.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=zvrp6fsrucSfzZZAfLt9mNI8J94=";

    @NotNull
    public static final String URL_HR = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_hr.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=dUQUySF/Uo7BcybPqpcWGBapD+E=";

    @NotNull
    public static final String URL_HU = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_hu.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=mCTnBY4PIjVKKgVuQnQ346+3d1k=";

    @NotNull
    public static final String URL_IN = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_in.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=1WG1ZjSO8K8KJTULyiFJoDMUYMI=";

    @NotNull
    public static final String URL_IT = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_it.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=MqzuEzvACILs/XAqX2phAxjOeu0=";

    @NotNull
    public static final String URL_IW_IL = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_iw_il.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=7XgFyCZmZK0VVzMCVih+hpLB2lk=";

    @NotNull
    public static final String URL_JA = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_ja.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=ryonAurR+B7Z9qTMrFzTnpPvSKQ=";

    @NotNull
    public static final String URL_KO = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_ko.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=p4Shoscb8HK7qNpcT7kf4wyNk4E=";

    @NotNull
    public static final String URL_LT = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_lt.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=sfuGY+Marqjv9xke87ryBlRBJ84=";

    @NotNull
    public static final String URL_LV = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_lv.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=P/t9zWCc+S4Xh+SHOjmR/w5gRPA=";

    @NotNull
    public static final String URL_NB = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_nb.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=cs4eM6KRrZywS/lrYwNKWXlt+PI=";

    @NotNull
    public static final String URL_NL = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_nl.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=GmXulJxxh44L4gvpWGKG9qUZoPY=";

    @NotNull
    public static final String URL_PL = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_pl.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=vTB3eWT6GhpEAXhdf8zyUIjWuOI=";

    @NotNull
    public static final String URL_PT_BR = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_pt_br.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=WECuBCG29EDPUKddbSNGP+A4Z/I=";

    @NotNull
    public static final String URL_PT_PT = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_pt_pt.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=hQLyL0BayOOjYf9ixu0cNRACWJ8=";

    @NotNull
    public static final String URL_RO = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_ro.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=2crMivjaHqGJOWZpmfPyPDyU1II=";

    @NotNull
    public static final String URL_RU = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_ru.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=0hFYPG4+mL+TzJ18q7Lxi7HfLao=";

    @NotNull
    public static final String URL_SK = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_sk.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=5WLFiIsHCmQNRpJxG1b4PgTC2k8=";

    @NotNull
    public static final String URL_SL = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_sl.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=wzp6mf3pjlJ8DrvL7gOnr/UKhm4=";

    @NotNull
    public static final String URL_SR = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_sr.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=5Trq6TC+LWikSYxKkxaemYBFsHI=";

    @NotNull
    public static final String URL_SV = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_sv.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=9kJ1nJ7n4ohmdWsef7WM7naFbwA=";

    @NotNull
    public static final String URL_TH = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_th.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=F6ss6t95z60fuX3Hw+0WcrRP9F4=";

    @NotNull
    public static final String URL_TR = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_tr.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=7A9xiKonGshpr2M0sfxFYkCelXg=";

    @NotNull
    public static final String URL_UG_CN = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_ug_cn.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=UcFbIjvwFSlteojtVXil/e6cJFI=";

    @NotNull
    public static final String URL_UK = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_uk.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=RL3dcBn/bE/IcryTFwrfOsnCJ8s=";

    @NotNull
    public static final String URL_VI = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_vi.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=G3U13tM90rc5C7T7wBAOzdOiIsw=";

    @NotNull
    public static final String URL_ZH_CH_V1 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_zh_cn_v1.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=aS60NmOrYd/EqTIQcWhqCloTJ+c=";

    @NotNull
    public static final String URL_ZH_CN = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_zh_cn.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=zi+7KMQEun18Xl3xGr4Mxh+gF88=";

    @NotNull
    public static final String URL_ZH_HK = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_zh_hk.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=8vLp4UDpN8UpWv4IctsPgYZu0NE=";

    @NotNull
    public static final String URL_ZH_HK_V1 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_zh_hk_v1.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=UbEkuaRDTB4jQF3MxwycNlo7/8w=";

    @NotNull
    public static final String URL_ZH_TW = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_zh_tw.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=OZQnkteh6OsIQnhI3suSGiLAllA=";

    @NotNull
    public static final String URL_ZH_TW_V1 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_suggest_zh_tw_v1.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=Yov4A+DcMpeqKdjarX+1EMlSU3Y=";

    private SleepInterpretationConstants() {
    }
}
