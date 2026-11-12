package defpackage;

import cn.miao.health.bean.AnalyzeInfo;
import cn.miao.health.bean.HeartInfo;
import cn.miao.health.bean.ManualInputInfo;
import cn.miao.health.bean.MiaoHealthHeartInfo;
import cn.miao.health.bean.MiaoHealthManualInputInfo;
import cn.miao.health.bean.MiaoHealthSleepInfo;
import cn.miao.health.bean.SleepInfo;
import com.amap.api.services.core.AMapException;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.mi_connect_sdk.BuildConfig;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class q91 {
    /* JADX WARN: Code duplicated, block: B:100:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:103:0x0317  */
    /* JADX WARN: Code duplicated, block: B:105:0x032a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0341  */
    /* JADX WARN: Code duplicated, block: B:110:0x0354  */
    /* JADX WARN: Code duplicated, block: B:113:0x036b  */
    /* JADX WARN: Code duplicated, block: B:115:0x037b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0398  */
    /* JADX WARN: Code duplicated, block: B:125:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:127:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:130:0x03de  */
    /* JADX WARN: Code duplicated, block: B:132:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:135:0x0405  */
    /* JADX WARN: Code duplicated, block: B:137:0x0417  */
    /* JADX WARN: Code duplicated, block: B:140:0x042c  */
    /* JADX WARN: Code duplicated, block: B:142:0x043b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x0180  */
    /* JADX WARN: Code duplicated, block: B:56:0x018d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0209  */
    /* JADX WARN: Code duplicated, block: B:66:0x0216  */
    /* JADX WARN: Code duplicated, block: B:69:0x0229  */
    /* JADX WARN: Code duplicated, block: B:71:0x0236  */
    /* JADX WARN: Code duplicated, block: B:74:0x0249  */
    /* JADX WARN: Code duplicated, block: B:76:0x0256  */
    /* JADX WARN: Code duplicated, block: B:79:0x0269  */
    /* JADX WARN: Code duplicated, block: B:81:0x0276  */
    /* JADX WARN: Code duplicated, block: B:87:0x0291  */
    /* JADX WARN: Code duplicated, block: B:98:0x02eb  */
    public static MiaoHealthHeartInfo a(HeartInfo heartInfo) {
        double d;
        double dIntValue;
        double d2;
        MiaoHealthHeartInfo miaoHealthHeartInfo;
        AnalyzeInfo analyzeInfo;
        Integer sportHeartRate;
        Integer heartRateMax;
        int iIntValue;
        Integer heartRateResting;
        float f;
        double dIntValue2;
        double dIntValue3;
        AnalyzeInfo analyzeInfo2;
        double dIntValue4;
        double dIntValue5;
        double dIntValue6;
        double dIntValue7;
        AnalyzeInfo analyzeInfo3;
        AnalyzeInfo analyzeInfo4;
        AnalyzeInfo analyzeInfo5;
        if (heartInfo == null || heartInfo.getAge() == null) {
            return null;
        }
        Integer age = heartInfo.getAge();
        if (age.intValue() < 14 || age.intValue() >= 18) {
            if (age.intValue() >= 18) {
                dIntValue = ((double) age.intValue()) * 0.7d;
                d2 = 207.0d;
            } else {
                d = 0.0d;
            }
            int iIntValue2 = new BigDecimal(d).setScale(0, 4).intValue();
            miaoHealthHeartInfo = new MiaoHealthHeartInfo();
            miaoHealthHeartInfo.setHeartRateSportMax(Integer.valueOf(iIntValue2));
            if (heartInfo.getHeartRateResting() != null) {
                analyzeInfo5 = new AnalyzeInfo();
                analyzeInfo5.setExplainMapping(1100);
                if (heartInfo.getHeartRateResting().intValue() < 55) {
                    analyzeInfo5.setAnalyzeMapping(200);
                    miaoHealthHeartInfo.setHrrEvaluation(analyzeInfo5);
                } else if (heartInfo.getHeartRateResting().intValue() < 55 && heartInfo.getHeartRateResting().intValue() <= 80) {
                    analyzeInfo5.setAnalyzeMapping(201);
                    miaoHealthHeartInfo.setHrrEvaluation(analyzeInfo5);
                } else if (heartInfo.getHeartRateResting().intValue() > 80) {
                    analyzeInfo5.setAnalyzeMapping(202);
                    miaoHealthHeartInfo.setHrrEvaluation(analyzeInfo5);
                }
            }
            if (heartInfo.getConventionHeartRate() != null) {
                analyzeInfo4 = new AnalyzeInfo();
                analyzeInfo4.setExplainMapping(AMapException.CODE_AMAP_ENGINE_CONNECT_TIMEOUT);
                if (heartInfo.getConventionHeartRate().intValue() < 60) {
                    analyzeInfo4.setAnalyzeMapping(200);
                } else if (heartInfo.getConventionHeartRate().intValue() < 60 && heartInfo.getConventionHeartRate().intValue() <= 100) {
                    analyzeInfo4.setAnalyzeMapping(201);
                } else if (heartInfo.getConventionHeartRate().intValue() > 100) {
                    analyzeInfo4.setAnalyzeMapping(202);
                }
                miaoHealthHeartInfo.setConventionHeart(analyzeInfo4);
            }
            if (miaoHealthHeartInfo.getHeartRateSportMax() != null && heartInfo.getHeartRateResting() != null && heartInfo.getHeartRate() != null) {
                int iIntValue3 = miaoHealthHeartInfo.getHeartRateSportMax().intValue() - heartInfo.getHeartRateResting().intValue();
                miaoHealthHeartInfo.setHeartRateReserve(Integer.valueOf(iIntValue3));
                double d3 = iIntValue3;
                double d4 = 0.4d * d3;
                dIntValue2 = ((double) heartInfo.getHeartRateResting().intValue()) + d4;
                double d5 = 0.6d * d3;
                dIntValue3 = ((double) heartInfo.getHeartRateResting().intValue()) + d5;
                double dIntValue8 = heartInfo.getHeartRate().intValue() + iIntValue3;
                analyzeInfo2 = new AnalyzeInfo();
                if (heartInfo.getHeartRate().intValue() < dIntValue2 && heartInfo.getHeartRate().intValue() < dIntValue3) {
                    analyzeInfo2.setAnalyzeMapping(210);
                } else if (heartInfo.getHeartRate().intValue() >= dIntValue3 && heartInfo.getHeartRate().intValue() <= dIntValue8) {
                    analyzeInfo2.setAnalyzeMapping(211);
                }
                miaoHealthHeartInfo.setHeartIntension(analyzeInfo2);
                dIntValue4 = (0.3d * d3) + ((double) heartInfo.getHeartRateResting().intValue());
                dIntValue5 = d4 + ((double) heartInfo.getHeartRateResting().intValue());
                dIntValue6 = d5 + ((double) heartInfo.getHeartRateResting().intValue());
                dIntValue7 = (d3 * 0.9d) + ((double) heartInfo.getHeartRateResting().intValue());
                double dIntValue9 = iIntValue3 + heartInfo.getHeartRateResting().intValue();
                analyzeInfo3 = new AnalyzeInfo();
                analyzeInfo3.setExplainMapping(AMapException.CODE_AMAP_ENGINE_RESPONSE_DATA_ERROR);
                if (heartInfo.getHeartRate().intValue() < 0 && heartInfo.getHeartRate().intValue() < dIntValue4) {
                    analyzeInfo3.setAnalyzeMapping(220);
                } else if (heartInfo.getHeartRate().intValue() < dIntValue4 && heartInfo.getHeartRate().intValue() < dIntValue5) {
                    analyzeInfo3.setAnalyzeMapping(221);
                } else if (heartInfo.getHeartRate().intValue() < dIntValue5 && heartInfo.getHeartRate().intValue() < dIntValue6) {
                    analyzeInfo3.setAnalyzeMapping(222);
                } else if (heartInfo.getHeartRate().intValue() < dIntValue6 && heartInfo.getHeartRate().intValue() < dIntValue7) {
                    analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.targetValueNumber);
                } else if (heartInfo.getHeartRate().intValue() >= dIntValue7 && heartInfo.getHeartRate().intValue() <= dIntValue9) {
                    analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                }
                miaoHealthHeartInfo.setThrEvaluation(analyzeInfo3);
            }
            if (heartInfo.getSportHeartRate() != null) {
                analyzeInfo = new AnalyzeInfo();
                analyzeInfo.setExplainMapping(AMapException.CODE_AMAP_ENGINE_RETURN_TIMEOUT);
                sportHeartRate = heartInfo.getSportHeartRate();
                if (miaoHealthHeartInfo.getHeartRateSportMax() != null && heartInfo.getHeartRateResting() != null && heartInfo.getHeartRate() != null) {
                    iIntValue = miaoHealthHeartInfo.getHeartRateSportMax().intValue() - heartInfo.getHeartRateResting().intValue();
                    heartRateResting = heartInfo.getHeartRateResting();
                    if (sportHeartRate.intValue() >= heartRateResting.intValue() || sportHeartRate.intValue() >= (iIntValue * 0.3f) + heartRateResting.intValue()) {
                        f = iIntValue;
                        if (sportHeartRate.intValue() < (0.3f * f) + heartRateResting.intValue() && sportHeartRate.intValue() < (f * 0.4f) + heartRateResting.intValue()) {
                            analyzeInfo.setAnalyzeMapping(221);
                        } else if (sportHeartRate.intValue() < (0.4f * f) + heartRateResting.intValue() && sportHeartRate.intValue() < (f * 0.6f) + heartRateResting.intValue()) {
                            analyzeInfo.setAnalyzeMapping(222);
                        } else if (sportHeartRate.intValue() < (0.6f * f) + heartRateResting.intValue() && sportHeartRate.intValue() < (f * 0.9f) + heartRateResting.intValue()) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.targetValueNumber);
                        } else if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue() && sportHeartRate.intValue() <= (f * 1.0f) + heartRateResting.intValue()) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else {
                        analyzeInfo.setAnalyzeMapping(220);
                    }
                }
                heartRateMax = heartInfo.getHeartRateMax();
                if (heartRateMax != null) {
                    if (sportHeartRate.intValue() < 0 && sportHeartRate.intValue() < heartRateMax.intValue() * 0.57f) {
                        analyzeInfo.setAnalyzeMapping(220);
                    } else if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.57f && sportHeartRate.intValue() < heartRateMax.intValue() * 0.64f) {
                        analyzeInfo.setAnalyzeMapping(221);
                    } else if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.64f && sportHeartRate.intValue() < heartRateMax.intValue() * 0.77f) {
                        analyzeInfo.setAnalyzeMapping(222);
                    } else if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.77f && sportHeartRate.intValue() < heartRateMax.intValue() * 0.96f) {
                        analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.targetValueNumber);
                    } else if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                        analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                }
                miaoHealthHeartInfo.setSportHeartEvaluation(analyzeInfo);
            }
            return miaoHealthHeartInfo;
        }
        dIntValue = ((double) age.intValue()) * 0.84d;
        d2 = 216.6d;
        d = d2 - dIntValue;
        int iIntValue4 = new BigDecimal(d).setScale(0, 4).intValue();
        miaoHealthHeartInfo = new MiaoHealthHeartInfo();
        miaoHealthHeartInfo.setHeartRateSportMax(Integer.valueOf(iIntValue4));
        if (heartInfo.getHeartRateResting() != null) {
            analyzeInfo5 = new AnalyzeInfo();
            analyzeInfo5.setExplainMapping(1100);
            if (heartInfo.getHeartRateResting().intValue() < 55) {
                analyzeInfo5.setAnalyzeMapping(200);
                miaoHealthHeartInfo.setHrrEvaluation(analyzeInfo5);
            } else if (heartInfo.getHeartRateResting().intValue() < 55) {
                if (heartInfo.getHeartRateResting().intValue() > 80) {
                    analyzeInfo5.setAnalyzeMapping(202);
                    miaoHealthHeartInfo.setHrrEvaluation(analyzeInfo5);
                }
            } else if (heartInfo.getHeartRateResting().intValue() > 80) {
                analyzeInfo5.setAnalyzeMapping(202);
                miaoHealthHeartInfo.setHrrEvaluation(analyzeInfo5);
            }
        }
        if (heartInfo.getConventionHeartRate() != null) {
            analyzeInfo4 = new AnalyzeInfo();
            analyzeInfo4.setExplainMapping(AMapException.CODE_AMAP_ENGINE_CONNECT_TIMEOUT);
            if (heartInfo.getConventionHeartRate().intValue() < 60) {
                analyzeInfo4.setAnalyzeMapping(200);
            } else if (heartInfo.getConventionHeartRate().intValue() < 60) {
                if (heartInfo.getConventionHeartRate().intValue() > 100) {
                    analyzeInfo4.setAnalyzeMapping(202);
                }
            } else if (heartInfo.getConventionHeartRate().intValue() > 100) {
                analyzeInfo4.setAnalyzeMapping(202);
            }
            miaoHealthHeartInfo.setConventionHeart(analyzeInfo4);
        }
        if (miaoHealthHeartInfo.getHeartRateSportMax() != null) {
            int iIntValue5 = miaoHealthHeartInfo.getHeartRateSportMax().intValue() - heartInfo.getHeartRateResting().intValue();
            miaoHealthHeartInfo.setHeartRateReserve(Integer.valueOf(iIntValue5));
            double d6 = iIntValue5;
            double d7 = 0.4d * d6;
            dIntValue2 = ((double) heartInfo.getHeartRateResting().intValue()) + d7;
            double d8 = 0.6d * d6;
            dIntValue3 = ((double) heartInfo.getHeartRateResting().intValue()) + d8;
            double dIntValue10 = heartInfo.getHeartRate().intValue() + iIntValue5;
            analyzeInfo2 = new AnalyzeInfo();
            if (heartInfo.getHeartRate().intValue() < dIntValue2) {
                if (heartInfo.getHeartRate().intValue() >= dIntValue3) {
                    analyzeInfo2.setAnalyzeMapping(211);
                }
            } else if (heartInfo.getHeartRate().intValue() >= dIntValue3) {
                analyzeInfo2.setAnalyzeMapping(211);
            }
            miaoHealthHeartInfo.setHeartIntension(analyzeInfo2);
            dIntValue4 = (0.3d * d6) + ((double) heartInfo.getHeartRateResting().intValue());
            dIntValue5 = d7 + ((double) heartInfo.getHeartRateResting().intValue());
            dIntValue6 = d8 + ((double) heartInfo.getHeartRateResting().intValue());
            dIntValue7 = (d6 * 0.9d) + ((double) heartInfo.getHeartRateResting().intValue());
            double dIntValue11 = iIntValue5 + heartInfo.getHeartRateResting().intValue();
            analyzeInfo3 = new AnalyzeInfo();
            analyzeInfo3.setExplainMapping(AMapException.CODE_AMAP_ENGINE_RESPONSE_DATA_ERROR);
            if (heartInfo.getHeartRate().intValue() < 0) {
                if (heartInfo.getHeartRate().intValue() < dIntValue4) {
                    if (heartInfo.getHeartRate().intValue() < dIntValue5) {
                        if (heartInfo.getHeartRate().intValue() < dIntValue6) {
                            if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                                analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                            analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (heartInfo.getHeartRate().intValue() < dIntValue6) {
                        if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                            analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                        analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else if (heartInfo.getHeartRate().intValue() < dIntValue5) {
                    if (heartInfo.getHeartRate().intValue() < dIntValue6) {
                        if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                            analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                        analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else if (heartInfo.getHeartRate().intValue() < dIntValue6) {
                    if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                        analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                    analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                }
            } else if (heartInfo.getHeartRate().intValue() < dIntValue4) {
                if (heartInfo.getHeartRate().intValue() < dIntValue5) {
                    if (heartInfo.getHeartRate().intValue() < dIntValue6) {
                        if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                            analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                        analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else if (heartInfo.getHeartRate().intValue() < dIntValue6) {
                    if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                        analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                    analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                }
            } else if (heartInfo.getHeartRate().intValue() < dIntValue5) {
                if (heartInfo.getHeartRate().intValue() < dIntValue6) {
                    if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                        analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                    analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                }
            } else if (heartInfo.getHeartRate().intValue() < dIntValue6) {
                if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                    analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                }
            } else if (heartInfo.getHeartRate().intValue() >= dIntValue7) {
                analyzeInfo3.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
            }
            miaoHealthHeartInfo.setThrEvaluation(analyzeInfo3);
        }
        if (heartInfo.getSportHeartRate() != null) {
            analyzeInfo = new AnalyzeInfo();
            analyzeInfo.setExplainMapping(AMapException.CODE_AMAP_ENGINE_RETURN_TIMEOUT);
            sportHeartRate = heartInfo.getSportHeartRate();
            if (miaoHealthHeartInfo.getHeartRateSportMax() != null) {
                iIntValue = miaoHealthHeartInfo.getHeartRateSportMax().intValue() - heartInfo.getHeartRateResting().intValue();
                heartRateResting = heartInfo.getHeartRateResting();
                if (sportHeartRate.intValue() >= heartRateResting.intValue()) {
                    f = iIntValue;
                    if (sportHeartRate.intValue() < (0.3f * f) + heartRateResting.intValue()) {
                        if (sportHeartRate.intValue() < (0.4f * f) + heartRateResting.intValue()) {
                            if (sportHeartRate.intValue() < (0.6f * f) + heartRateResting.intValue()) {
                                if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                                    analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                                }
                            } else if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                                analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (sportHeartRate.intValue() < (0.6f * f) + heartRateResting.intValue()) {
                            if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                                analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() < (0.4f * f) + heartRateResting.intValue()) {
                        if (sportHeartRate.intValue() < (0.6f * f) + heartRateResting.intValue()) {
                            if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                                analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() < (0.6f * f) + heartRateResting.intValue()) {
                        if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                        analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else {
                    f = iIntValue;
                    if (sportHeartRate.intValue() < (0.3f * f) + heartRateResting.intValue()) {
                        if (sportHeartRate.intValue() < (0.4f * f) + heartRateResting.intValue()) {
                            if (sportHeartRate.intValue() < (0.6f * f) + heartRateResting.intValue()) {
                                if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                                    analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                                }
                            } else if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                                analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (sportHeartRate.intValue() < (0.6f * f) + heartRateResting.intValue()) {
                            if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                                analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() < (0.4f * f) + heartRateResting.intValue()) {
                        if (sportHeartRate.intValue() < (0.6f * f) + heartRateResting.intValue()) {
                            if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                                analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() < (0.6f * f) + heartRateResting.intValue()) {
                        if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() >= (0.9f * f) + heartRateResting.intValue()) {
                        analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                }
            }
            heartRateMax = heartInfo.getHeartRateMax();
            if (heartRateMax != null) {
                if (sportHeartRate.intValue() < 0) {
                    if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.57f) {
                        if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.64f) {
                            if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.77f) {
                                if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                                    analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                                }
                            } else if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                                analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.77f) {
                            if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                                analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.64f) {
                        if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.77f) {
                            if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                                analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.77f) {
                        if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                        analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.57f) {
                    if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.64f) {
                        if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.77f) {
                            if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                                analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                            }
                        } else if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.77f) {
                        if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                        analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.64f) {
                    if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.77f) {
                        if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                            analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                        }
                    } else if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                        analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else if (sportHeartRate.intValue() < heartRateMax.intValue() * 0.77f) {
                    if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                        analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                    }
                } else if (sportHeartRate.intValue() >= heartRateMax.intValue() * 0.96f) {
                    analyzeInfo.setAnalyzeMapping(SportReportBaseParser.ReportType.avgFreq);
                }
            }
            miaoHealthHeartInfo.setSportHeartEvaluation(analyzeInfo);
        }
        return miaoHealthHeartInfo;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x013d  */
    /* JADX WARN: Code duplicated, block: B:90:0x015a  */
    public static MiaoHealthManualInputInfo b(ManualInputInfo manualInputInfo) {
        float f;
        int i;
        if (manualInputInfo == null) {
            return null;
        }
        float f2 = 0.0f;
        if (1 == manualInputInfo.getSex().intValue()) {
            if (manualInputInfo.getHeight() == null) {
                manualInputInfo.setHeight(173);
            }
            if (manualInputInfo.getWeight() == null) {
                manualInputInfo.setWeight(Double.valueOf(66.0d));
            }
            f = 0.3139f;
        } else if (2 == manualInputInfo.getSex().intValue()) {
            if (manualInputInfo.getHeight() == null) {
                manualInputInfo.setHeight(163);
            }
            if (manualInputInfo.getWeight() == null) {
                manualInputInfo.setWeight(Double.valueOf(56.0d));
            }
            f = 0.2975f;
        } else {
            f = 0.0f;
        }
        MiaoHealthManualInputInfo miaoHealthManualInputInfo = new MiaoHealthManualInputInfo();
        ManualInputInfo.SportType sportType = manualInputInfo.getSportType();
        Double velocity = manualInputInfo.getVelocity();
        Double duration = manualInputInfo.getDuration();
        Double distance = manualInputInfo.getDistance();
        if (velocity != null && distance == null) {
            miaoHealthManualInputInfo.setDistance(Integer.valueOf((int) (velocity.doubleValue() * duration.doubleValue())));
        }
        if (distance != null && velocity == null) {
            velocity = Double.valueOf(distance.doubleValue() / duration.doubleValue());
        }
        if (velocity == null) {
            velocity = Double.valueOf(0.0d);
        }
        double dDoubleValue = (velocity.doubleValue() * 60.0d) / 1000.0d;
        if (ManualInputInfo.SportType.WALK.equals(sportType)) {
            if (dDoubleValue <= 3.0d) {
                f2 = 2.5f;
                i = 1;
            } else if (dDoubleValue > 3.0d && dDoubleValue < 5.5d) {
                i = 2;
                f2 = 3.5f;
            } else if (dDoubleValue >= 5.5d && dDoubleValue <= 6.0d) {
                i = 2;
                f2 = 4.0f;
            } else if (dDoubleValue <= 6.0d || dDoubleValue >= 8.0d) {
                if (dDoubleValue < 8.0d) {
                    throw new RuntimeException("当前运动类型的速度值异常");
                }
                f2 = 7.0f;
                i = 3;
            } else {
                f2 = 4.5f;
                i = 2;
            }
        } else if (ManualInputInfo.SportType.CLIMB.equals(sportType)) {
            i = 3;
            f2 = 8.0f;
        } else if (ManualInputInfo.SportType.RUN.equals(sportType)) {
            if (dDoubleValue < 0.0d || dDoubleValue > 3.0d) {
                if (dDoubleValue <= 3.0d || dDoubleValue >= 6.0d) {
                    if (dDoubleValue < 6.0d || dDoubleValue >= 8.0d) {
                        if (dDoubleValue < 8.0d || dDoubleValue >= 9.0d) {
                            if (dDoubleValue < 9.0d) {
                                throw new RuntimeException("当前运动类型的速度值异常");
                            }
                            i = 3;
                            f2 = 10.0f;
                        }
                        i = 3;
                        f2 = 8.0f;
                    }
                    f2 = 7.0f;
                    i = 3;
                } else {
                    i = 2;
                    f2 = 6.0f;
                }
            }
            f2 = 2.5f;
            i = 1;
        } else if (ManualInputInfo.SportType.CYCLING.equals(sportType)) {
            if (dDoubleValue < 12.0d) {
                f2 = 2.8f;
                i = 1;
            } else if (dDoubleValue >= 12.0d && dDoubleValue < 16.0d) {
                i = 2;
                f2 = 4.0f;
            } else if (dDoubleValue < 16.0d || dDoubleValue >= 19.0d) {
                if (dDoubleValue < 19.0d || dDoubleValue >= 22.0d) {
                    if (dDoubleValue < 22.0d || dDoubleValue >= 25.5d) {
                        if (dDoubleValue >= 25.5d && dDoubleValue < 30.5d) {
                            f2 = 12.0f;
                        } else {
                            if (dDoubleValue < 30.5d) {
                                throw new RuntimeException("当前运动类型的速度值异常");
                            }
                            f2 = 16.0f;
                        }
                        i = 3;
                    } else {
                        i = 3;
                        f2 = 10.0f;
                    }
                }
                i = 3;
                f2 = 8.0f;
            } else {
                i = 2;
                f2 = 6.0f;
            }
        } else if (ManualInputInfo.SportType.BREASTSTROKE.equals(sportType)) {
            i = 3;
            f2 = 10.0f;
        } else {
            if (ManualInputInfo.SportType.BACKSTROKE.equals(sportType) || ManualInputInfo.SportType.FREESTYLE.equals(sportType)) {
                i = 3;
            } else if (ManualInputInfo.SportType.BUTTERFLYSTROKE.equals(sportType)) {
                f2 = 11.0f;
                i = 3;
            } else if (ManualInputInfo.SportType.MEDLEYSTROKE.equals(sportType)) {
                i = 2;
            } else if (ManualInputInfo.SportType.FREELANCE.equals(sportType)) {
                i = 2;
                f2 = 3.5f;
            } else {
                i = 0;
            }
            f2 = 8.0f;
        }
        double dDoubleValue2 = ((double) (f2 / 60.0f)) * manualInputInfo.getWeight().doubleValue() * duration.doubleValue();
        miaoHealthManualInputInfo.setStep(Integer.valueOf((int) (Math.pow((dDoubleValue * 5.0d) / ((double) (((f * 18.0f) * manualInputInfo.getHeight().intValue()) / 100.0f)), 0.6666666667d) * duration.doubleValue() * 60.0d)));
        miaoHealthManualInputInfo.setCalories(Double.valueOf(dDoubleValue2));
        miaoHealthManualInputInfo.setIntensity(Integer.valueOf(i));
        return miaoHealthManualInputInfo;
    }

    public static MiaoHealthSleepInfo c(SleepInfo sleepInfo) {
        int iIntValue;
        int i;
        int i2;
        int i3;
        int i4;
        if (sleepInfo == null) {
            return null;
        }
        MiaoHealthSleepInfo miaoHealthSleepInfo = new MiaoHealthSleepInfo();
        Integer age = sleepInfo.getAge();
        if (sleepInfo.getSleepDuration() != null) {
            Integer sleepDuration = sleepInfo.getSleepDuration();
            AnalyzeInfo analyzeInfo = new AnalyzeInfo();
            analyzeInfo.setExplainMapping(AMapException.CODE_AMAP_SERVICE_ILLEGAL_REQUEST);
            if (age.intValue() == 14) {
                if (sleepDuration.intValue() < 540) {
                    analyzeInfo.setAnalyzeMapping(320);
                } else if (sleepDuration.intValue() >= 540 && sleepDuration.intValue() <= 600) {
                    analyzeInfo.setAnalyzeMapping(322);
                } else if (sleepDuration.intValue() > 600) {
                    analyzeInfo.setAnalyzeMapping(323);
                }
            } else if (age.intValue() <= 14 || age.intValue() >= 18) {
                if (age.intValue() >= 18) {
                    if (sleepDuration.intValue() < 360) {
                        analyzeInfo.setAnalyzeMapping(320);
                    } else if (sleepDuration.intValue() >= 360 && sleepDuration.intValue() < 420) {
                        analyzeInfo.setAnalyzeMapping(321);
                    } else if (sleepDuration.intValue() >= 420 && sleepDuration.intValue() <= 540) {
                        analyzeInfo.setAnalyzeMapping(322);
                    } else if (sleepDuration.intValue() > 540) {
                        analyzeInfo.setAnalyzeMapping(323);
                    }
                }
            } else if (sleepDuration.intValue() < 480) {
                analyzeInfo.setAnalyzeMapping(320);
            } else if (sleepDuration.intValue() >= 480 && sleepDuration.intValue() <= 540) {
                analyzeInfo.setAnalyzeMapping(322);
            } else if (sleepDuration.intValue() > 540) {
                analyzeInfo.setAnalyzeMapping(323);
            }
            miaoHealthSleepInfo.setSatEvaluation(analyzeInfo);
        }
        Date dateA = sp5.a(sleepInfo.getBedTime());
        if (dateA != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateA);
            int i5 = calendar.get(11);
            int i6 = calendar.get(12);
            AnalyzeInfo analyzeInfo2 = new AnalyzeInfo();
            analyzeInfo2.setExplainMapping(1200);
            if (i5 >= 20 && i5 < 23) {
                analyzeInfo2.setAnalyzeMapping(300);
            } else if ((i5 >= 0 && i5 <= 5) || i5 >= 23 || (i5 == 6 && i6 == 0)) {
                analyzeInfo2.setAnalyzeMapping(301);
            } else if (i5 >= 6 && i5 < 20) {
                analyzeInfo2.setAnalyzeMapping(302);
            }
            miaoHealthSleepInfo.setStartTimeEvaluation(analyzeInfo2);
        }
        Date dateA2 = sp5.a(sleepInfo.getWakeupTime());
        if (dateA == null || dateA2 == null) {
            iIntValue = 0;
        } else {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(dateA2);
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(dateA);
            iIntValue = new BigDecimal(((calendar2.getTimeInMillis() - calendar3.getTimeInMillis()) / 1000.0d) / 60.0d).setScale(0, 1).intValue();
            float fFloatValue = new BigDecimal(((calendar2.getTimeInMillis() - calendar3.getTimeInMillis()) / 1000.0d) / 3600.0d).setScale(2, 1).floatValue();
            AnalyzeInfo analyzeInfo3 = new AnalyzeInfo();
            analyzeInfo3.setExplainMapping(AMapException.CODE_AMAP_SERVICE_ILLEGAL_REQUEST);
            if (age.intValue() == 14) {
                if (fFloatValue < 9.0f) {
                    analyzeInfo3.setAnalyzeMapping(320);
                } else if (fFloatValue >= 9.0f && fFloatValue <= 10.0f) {
                    analyzeInfo3.setAnalyzeMapping(322);
                } else if (fFloatValue > 10.0f) {
                    analyzeInfo3.setAnalyzeMapping(323);
                }
            } else if (age.intValue() <= 14 || age.intValue() >= 18) {
                if (age.intValue() >= 18) {
                    if (fFloatValue < 6.0f) {
                        analyzeInfo3.setAnalyzeMapping(320);
                    } else if (fFloatValue >= 6.0f && fFloatValue < 7.0f) {
                        analyzeInfo3.setAnalyzeMapping(321);
                    } else if (fFloatValue >= 7.0f && fFloatValue <= 9.0f) {
                        analyzeInfo3.setAnalyzeMapping(322);
                    } else if (fFloatValue > 9.0f) {
                        analyzeInfo3.setAnalyzeMapping(323);
                    }
                }
            } else if (fFloatValue < 8.0f) {
                analyzeInfo3.setAnalyzeMapping(320);
            } else if (fFloatValue >= 8.0f && fFloatValue <= 9.0f) {
                analyzeInfo3.setAnalyzeMapping(322);
            } else if (fFloatValue > 9.0f) {
                analyzeInfo3.setAnalyzeMapping(323);
            }
            miaoHealthSleepInfo.setSatEvaluation(analyzeInfo3);
            miaoHealthSleepInfo.setSleepAllTime(Float.valueOf(fFloatValue));
            AnalyzeInfo analyzeInfo4 = new AnalyzeInfo();
            analyzeInfo4.setExplainMapping(AMapException.CODE_AMAP_SERVICE_MISSING_REQUIRED_PARAMS);
            if (fFloatValue < 7.0f) {
                analyzeInfo4.setAnalyzeMapping(310);
            } else if (fFloatValue >= 7.0f && fFloatValue <= 9.0f) {
                analyzeInfo4.setAnalyzeMapping(311);
            } else if (fFloatValue > 9.0f) {
                analyzeInfo4.setAnalyzeMapping(312);
            }
            miaoHealthSleepInfo.setEndTimeEvaluation(analyzeInfo4);
        }
        if (sleepInfo.getDeepSleepDuration() != null && sleepInfo.getLightSleepDuration() != null) {
            AnalyzeInfo analyzeInfo5 = new AnalyzeInfo();
            analyzeInfo5.setExplainMapping(AMapException.CODE_AMAP_SERVICE_ILLEGAL_REQUEST);
            int iIntValue2 = sleepInfo.getLightSleepDuration().intValue() + sleepInfo.getDeepSleepDuration().intValue();
            if (age != null) {
                if (age.intValue() == 14) {
                    if (iIntValue2 < 540) {
                        analyzeInfo5.setAnalyzeMapping(320);
                    } else if (iIntValue2 >= 540 && iIntValue2 <= 600) {
                        analyzeInfo5.setAnalyzeMapping(322);
                    } else if (iIntValue2 > 600) {
                        analyzeInfo5.setAnalyzeMapping(323);
                    }
                } else if (age.intValue() <= 14 || age.intValue() >= 18) {
                    if (age.intValue() >= 18) {
                        if (iIntValue2 < 360) {
                            analyzeInfo5.setAnalyzeMapping(320);
                        } else if (iIntValue2 >= 360 && iIntValue2 < 420) {
                            analyzeInfo5.setAnalyzeMapping(321);
                        } else if (iIntValue2 >= 420 && iIntValue2 <= 540) {
                            analyzeInfo5.setAnalyzeMapping(322);
                        } else if (iIntValue2 > 540) {
                            analyzeInfo5.setAnalyzeMapping(323);
                        }
                    }
                } else if (iIntValue2 < 480) {
                    analyzeInfo5.setAnalyzeMapping(320);
                } else if (iIntValue2 >= 480 && iIntValue2 <= 540) {
                    analyzeInfo5.setAnalyzeMapping(322);
                } else if (iIntValue2 > 540) {
                    analyzeInfo5.setAnalyzeMapping(323);
                }
                miaoHealthSleepInfo.setSatEvaluation(analyzeInfo5);
            }
            if (miaoHealthSleepInfo.getSleepAllTime() != null && miaoHealthSleepInfo.getSleepAllTime().floatValue() > 0.0f) {
                AnalyzeInfo analyzeInfo6 = new AnalyzeInfo();
                analyzeInfo6.setExplainMapping(1204);
                double d = (((double) iIntValue2) * 100.0d) / ((double) iIntValue);
                if (d < 85.0d) {
                    analyzeInfo6.setAnalyzeMapping(340);
                } else if (d >= 85.0d) {
                    analyzeInfo6.setAnalyzeMapping(341);
                }
                miaoHealthSleepInfo.setEfficiencyEvaluation(analyzeInfo6);
            }
        }
        if (age != null && sleepInfo.getLightSleepDuration() != null) {
            AnalyzeInfo analyzeInfo7 = new AnalyzeInfo();
            analyzeInfo7.setExplainMapping(1206);
            double dIntValue = ((double) sleepInfo.getLightSleepDuration().intValue()) / 60.0d;
            if (2 == sleepInfo.getSourceType().intValue()) {
                if (age.intValue() == 14) {
                    if (dIntValue >= 0.0d && dIntValue < 4.5d) {
                        analyzeInfo7.setAnalyzeMapping(BuildConfig.MiConnectVersionBuild);
                    } else if (dIntValue >= 4.5d && dIntValue <= 6.0d) {
                        analyzeInfo7.setAnalyzeMapping(371);
                    } else if (dIntValue > 6.0d && dIntValue < 14.4d) {
                        analyzeInfo7.setAnalyzeMapping(372);
                    }
                } else if (age.intValue() <= 14 || age.intValue() >= 18) {
                    if (age.intValue() >= 18) {
                        if (dIntValue >= 0.0d && dIntValue < 3.5d) {
                            analyzeInfo7.setAnalyzeMapping(BuildConfig.MiConnectVersionBuild);
                        } else if (dIntValue >= 3.5d && dIntValue <= 5.4d) {
                            analyzeInfo7.setAnalyzeMapping(371);
                        } else if (dIntValue > 5.4d && dIntValue < 14.4d) {
                            analyzeInfo7.setAnalyzeMapping(372);
                        }
                    }
                } else if (dIntValue >= 0.0d && dIntValue < 4.0d) {
                    analyzeInfo7.setAnalyzeMapping(BuildConfig.MiConnectVersionBuild);
                } else if (dIntValue >= 4.0d && dIntValue <= 5.4d) {
                    analyzeInfo7.setAnalyzeMapping(371);
                } else if (dIntValue > 5.4d && dIntValue < 14.4d) {
                    analyzeInfo7.setAnalyzeMapping(372);
                }
            } else if (age.intValue() == 14) {
                if (dIntValue >= 0.0d && dIntValue < 6.5d) {
                    analyzeInfo7.setAnalyzeMapping(BuildConfig.MiConnectVersionBuild);
                } else if (dIntValue >= 6.5d && dIntValue <= 8.2d) {
                    analyzeInfo7.setAnalyzeMapping(371);
                } else if (dIntValue > 8.2d && dIntValue < 19.2d) {
                    analyzeInfo7.setAnalyzeMapping(372);
                }
            } else if (age.intValue() <= 14 || age.intValue() >= 18) {
                if (age.intValue() >= 18) {
                    if (dIntValue >= 0.0d && dIntValue < 5.25d) {
                        analyzeInfo7.setAnalyzeMapping(BuildConfig.MiConnectVersionBuild);
                    } else if (dIntValue >= 5.25d && dIntValue <= 7.2d) {
                        analyzeInfo7.setAnalyzeMapping(371);
                    } else if (dIntValue > 7.2d && dIntValue < 19.2d) {
                        analyzeInfo7.setAnalyzeMapping(372);
                    }
                }
            } else if (dIntValue >= 0.0d && dIntValue < 6.2d) {
                analyzeInfo7.setAnalyzeMapping(BuildConfig.MiConnectVersionBuild);
            } else if (dIntValue >= 6.2d && dIntValue <= 7.4d) {
                analyzeInfo7.setAnalyzeMapping(371);
            } else if (dIntValue > 7.4d && dIntValue < 19.2d) {
                analyzeInfo7.setAnalyzeMapping(372);
            }
            miaoHealthSleepInfo.setLightSleepEvaluation(analyzeInfo7);
        }
        if (age != null && sleepInfo.getDeepSleepDuration() != null) {
            AnalyzeInfo analyzeInfo8 = new AnalyzeInfo();
            analyzeInfo8.setExplainMapping(1207);
            double dIntValue2 = ((double) sleepInfo.getDeepSleepDuration().intValue()) / 60.0d;
            if (age.intValue() == 14) {
                if (dIntValue2 >= 0.0d && dIntValue2 < 1.8d) {
                    analyzeInfo8.setAnalyzeMapping(380);
                } else if (dIntValue2 >= 1.8d && dIntValue2 <= 2.5d) {
                    analyzeInfo8.setAnalyzeMapping(381);
                } else if (dIntValue2 > 2.5d && dIntValue2 < 6.0d) {
                    analyzeInfo8.setAnalyzeMapping(382);
                }
            } else if (age.intValue() <= 14 || age.intValue() >= 18) {
                if (age.intValue() >= 18) {
                    if (dIntValue2 >= 0.0d && dIntValue2 < 1.4d) {
                        analyzeInfo8.setAnalyzeMapping(380);
                    } else if (dIntValue2 >= 1.4d && dIntValue2 <= 2.25d) {
                        analyzeInfo8.setAnalyzeMapping(381);
                    } else if (dIntValue2 > 2.25d && dIntValue2 < 6.0d) {
                        analyzeInfo8.setAnalyzeMapping(382);
                    }
                }
            } else if (dIntValue2 >= 0.0d && dIntValue2 < 1.6d) {
                analyzeInfo8.setAnalyzeMapping(380);
            } else if (dIntValue2 >= 1.6d && dIntValue2 <= 1.8d) {
                analyzeInfo8.setAnalyzeMapping(381);
            } else if (dIntValue2 > 1.8d && dIntValue2 < 6.0d) {
                analyzeInfo8.setAnalyzeMapping(382);
            }
            miaoHealthSleepInfo.setDeepSleepEvaluation(analyzeInfo8);
        }
        if (sleepInfo.getFallAsleepDuration() != null) {
            AnalyzeInfo analyzeInfo9 = new AnalyzeInfo();
            analyzeInfo9.setExplainMapping(AMapException.CODE_AMAP_SERVICE_UNKNOWN_ERROR);
            if (sleepInfo.getFallAsleepDuration().intValue() <= 30) {
                analyzeInfo9.setAnalyzeMapping(330);
            } else if (sleepInfo.getFallAsleepDuration().intValue() > 30) {
                analyzeInfo9.setAnalyzeMapping(331);
            }
            miaoHealthSleepInfo.setSleepTimeEvaluation(analyzeInfo9);
        }
        if (sleepInfo.getWakingTimes() != null) {
            AnalyzeInfo analyzeInfo10 = new AnalyzeInfo();
            if (sleepInfo.getWakingTimes().intValue() <= 1) {
                analyzeInfo10.setAnalyzeMapping(351);
            } else if (sleepInfo.getWakingTimes().intValue() >= 2) {
                analyzeInfo10.setAnalyzeMapping(352);
            }
            miaoHealthSleepInfo.setWakingTimesEvaluation(analyzeInfo10);
        }
        if (sleepInfo.getWakingDuration() != null) {
            AnalyzeInfo analyzeInfo11 = new AnalyzeInfo();
            analyzeInfo11.setExplainMapping(1205);
            if (sleepInfo.getWakingDuration().intValue() <= 30) {
                analyzeInfo11.setAnalyzeMapping(361);
            } else if (sleepInfo.getWakingDuration().intValue() > 30) {
                analyzeInfo11.setAnalyzeMapping(362);
            }
            miaoHealthSleepInfo.setWakingDurationEvaluation(analyzeInfo11);
        }
        if (sleepInfo.getSnoringFrequency() != null) {
            AnalyzeInfo analyzeInfo12 = new AnalyzeInfo();
            analyzeInfo12.setExplainMapping(1209);
            if (sleepInfo.getSnoringFrequency().intValue() == 0) {
                analyzeInfo12.setAnalyzeMapping(400);
            } else if (sleepInfo.getSnoringFrequency().intValue() < 4 || sleepInfo.getSnoringFrequency().intValue() > 6) {
                analyzeInfo12.setAnalyzeMapping(401);
            } else if (sleepInfo.getSnoringFrequency().intValue() >= 4 && sleepInfo.getSnoringFrequency().intValue() <= 6) {
                analyzeInfo12.setAnalyzeMapping(402);
            }
            miaoHealthSleepInfo.setSnoreEvaluation(analyzeInfo12);
        }
        if (age != null && sleepInfo.getRemSleepDuration() != null) {
            AnalyzeInfo analyzeInfo13 = new AnalyzeInfo();
            analyzeInfo13.setExplainMapping(1208);
            double dIntValue3 = ((double) sleepInfo.getRemSleepDuration().intValue()) / 60.0d;
            if (age.intValue() == 14) {
                if (dIntValue3 >= 0.0d && dIntValue3 < 1.8d) {
                    analyzeInfo13.setAnalyzeMapping(390);
                } else if (dIntValue3 >= 1.8d && dIntValue3 <= 2.5d) {
                    analyzeInfo13.setAnalyzeMapping(391);
                } else if (dIntValue3 > 2.5d && dIntValue3 < 6.0d) {
                    analyzeInfo13.setAnalyzeMapping(392);
                }
            } else if (age.intValue() <= 14 || age.intValue() >= 18) {
                if (age.intValue() >= 18) {
                    if (dIntValue3 >= 0.0d && dIntValue3 < 1.4d) {
                        analyzeInfo13.setAnalyzeMapping(390);
                    } else if (dIntValue3 >= 1.4d && dIntValue3 <= 2.25d) {
                        analyzeInfo13.setAnalyzeMapping(391);
                    } else if (dIntValue3 > 2.25d && dIntValue3 < 6.0d) {
                        analyzeInfo13.setAnalyzeMapping(392);
                    }
                }
            } else if (dIntValue3 >= 0.0d && dIntValue3 < 1.6d) {
                analyzeInfo13.setAnalyzeMapping(390);
            } else if (dIntValue3 >= 1.6d && dIntValue3 <= 1.8d) {
                analyzeInfo13.setAnalyzeMapping(391);
            } else if (dIntValue3 > 1.8d && dIntValue3 < 6.0d) {
                analyzeInfo13.setAnalyzeMapping(392);
            }
            miaoHealthSleepInfo.setRemSleepEvaluation(analyzeInfo13);
        }
        if (sleepInfo.getSleepDuration() != null) {
            Integer sleepDuration2 = sleepInfo.getSleepDuration();
            AnalyzeInfo analyzeInfo14 = new AnalyzeInfo();
            analyzeInfo14.setExplainMapping(AMapException.CODE_AMAP_SERVICE_ILLEGAL_REQUEST);
            if (age.intValue() == 14) {
                if (sleepDuration2.intValue() < 540) {
                    analyzeInfo14.setAnalyzeMapping(320);
                } else {
                    if (sleepDuration2.intValue() >= 540) {
                        i4 = 600;
                        if (sleepDuration2.intValue() <= 600) {
                            analyzeInfo14.setAnalyzeMapping(322);
                        }
                    } else {
                        i4 = 600;
                    }
                    if (sleepDuration2.intValue() > i4) {
                        analyzeInfo14.setAnalyzeMapping(323);
                    }
                }
            } else if (age.intValue() <= 14 || age.intValue() >= 18) {
                if (age.intValue() >= 18) {
                    if (sleepDuration2.intValue() < 360) {
                        analyzeInfo14.setAnalyzeMapping(320);
                    } else {
                        if (sleepDuration2.intValue() >= 360) {
                            i = 420;
                            if (sleepDuration2.intValue() < 420) {
                                analyzeInfo14.setAnalyzeMapping(321);
                            }
                        } else {
                            i = 420;
                        }
                        if (sleepDuration2.intValue() >= i) {
                            i2 = 540;
                            if (sleepDuration2.intValue() <= 540) {
                                analyzeInfo14.setAnalyzeMapping(322);
                            }
                        } else {
                            i2 = 540;
                        }
                        if (sleepDuration2.intValue() > i2) {
                            analyzeInfo14.setAnalyzeMapping(323);
                        }
                    }
                }
            } else if (sleepDuration2.intValue() < 480) {
                analyzeInfo14.setAnalyzeMapping(320);
            } else {
                if (sleepDuration2.intValue() >= 480) {
                    i3 = 540;
                    if (sleepDuration2.intValue() <= 540) {
                        analyzeInfo14.setAnalyzeMapping(322);
                    }
                } else {
                    i3 = 540;
                }
                if (sleepDuration2.intValue() > i3) {
                    analyzeInfo14.setAnalyzeMapping(323);
                }
            }
            miaoHealthSleepInfo.setSatEvaluation(analyzeInfo14);
        }
        if (sleepInfo.getNapDuration() != null) {
            Integer napDuration = sleepInfo.getNapDuration();
            AnalyzeInfo analyzeInfo15 = new AnalyzeInfo();
            analyzeInfo15.setExplainMapping(1210);
            if (napDuration.intValue() > 0 && napDuration.intValue() < 10) {
                analyzeInfo15.setAnalyzeMapping(403);
            } else if (napDuration.intValue() >= 10 && napDuration.intValue() < 30) {
                analyzeInfo15.setAnalyzeMapping(404);
            } else if (napDuration.intValue() >= 30) {
                analyzeInfo15.setAnalyzeMapping(405);
            }
            miaoHealthSleepInfo.setNapEvaluation(analyzeInfo15);
        }
        return miaoHealthSleepInfo;
    }
}
