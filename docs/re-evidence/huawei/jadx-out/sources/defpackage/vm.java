package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.careforeyou.library.bean.CsFatScale;
import com.careforeyou.library.bean.RoleInfo;
import com.careforeyou.library.bean.WeightEntity;
import com.careforeyou.library.enums.Protocal_Type;
import com.careforeyou.library.utils.PrefsUtil;
import com.xshq.spring.utils.CouStru;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes4.dex */
public class vm extends PrefsUtil {
    private static volatile vm e;
    private Context d;

    public static vm c(Context context) {
        if (e == null) {
            synchronized (vm.class) {
                if (e == null) {
                    e = new vm(context);
                }
            }
        }
        return e;
    }

    private vm(Context context) {
        super(context);
        this.d = context;
    }

    public WeightEntity a(CsFatScale csFatScale) {
        WeightEntity weightEntity = new WeightEntity();
        weightEntity.setWeight((float) csFatScale.getWeight());
        weightEntity.setWeight_time(wh.c());
        float axunge = (float) csFatScale.getAxunge();
        if (csFatScale.getDeviceType() == 0 && csFatScale.getImpedance() == 0.0f && axunge == 0.0f) {
            axunge = -1.0f;
        }
        weightEntity.setAxunge(axunge);
        weightEntity.setBody_age((float) csFatScale.getAge());
        weightEntity.setBone((float) csFatScale.getBone());
        weightEntity.setMetabolism((float) csFatScale.getBmrC());
        weightEntity.setMuscle((float) csFatScale.getMuscle());
        weightEntity.setViscera((float) csFatScale.getVisceral_fat());
        weightEntity.setWater((float) csFatScale.getWater());
        weightEntity.setR1(csFatScale.getImpedance());
        weightEntity.setRn8(csFatScale.getRemark());
        weightEntity.setScaleweight(csFatScale.getScaleWeightC());
        weightEntity.setHeartRateMeasuringType(csFatScale.getHeartRateMeasuringType());
        weightEntity.setInsRateMeasuringType(csFatScale.getImpedanceMeasuringType());
        return weightEntity;
    }

    public WeightEntity e(float f, String str, float f2, Date date, int i) {
        WeightEntity weightEntity = new WeightEntity();
        weightEntity.setWeight(f);
        weightEntity.setScaleweight(str);
        weightEntity.setWeight_time(wh.e(date == null ? new Date().getTime() : date.getTime()));
        weightEntity.setR1(f2);
        return weightEntity;
    }

    public void e(WeightEntity weightEntity, RoleInfo roleInfo, vi viVar) {
        try {
            if (viVar == null) {
                e(weightEntity);
                return;
            }
            wf.e("WeighDataParser", "++fillFatWithSmoothImpedance+" + viVar.b() + ",productId:" + viVar.e());
            if (viVar.b() != Protocal_Type.XIANGSHAN && viVar.e() != 843465809) {
                weightEntity.setBmi(e(roleInfo.getHeight(), weightEntity.getWeight()));
                if (weightEntity.getR1() == 0.0f) {
                    e(weightEntity);
                    return;
                }
                if (weightEntity.getWeight() >= 20.0f && weightEntity.getBmi() >= 5.0f) {
                    int sex = roleInfo.getSex();
                    int age = roleInfo.getAge();
                    double weight = weightEntity.getWeight();
                    float height = roleInfo.getHeight();
                    if (age > 5) {
                        float f = (float) weight;
                        byte b2 = (byte) sex;
                        ve veVar = new ve(height, f, b2, age, weightEntity.getR1());
                        weightEntity.setAxunge(veVar.b());
                        weightEntity.setViscera(veVar.m());
                        weightEntity.setWater(veVar.o());
                        weightEntity.setBone(veVar.j());
                        weightEntity.setMuscle(veVar.e(0.0f));
                        weightEntity.setMetabolism(veVar.e());
                        weightEntity.setBody_age(veVar.d());
                        weightEntity.setScore((int) veVar.h());
                        weightEntity.setBw(veVar.a());
                        weightEntity.setProtein(ve.d(f, b2, weightEntity.getAxunge(), weightEntity.getWater()));
                        float weight2 = (weightEntity.getWeight() * weightEntity.getMuscle()) / 100.0f;
                        int iC = c(this.d, roleInfo, weightEntity);
                        float weight3 = weightEntity.getWeight();
                        float axunge = weightEntity.getAxunge() / 100.0f;
                        int iA = ve.a(weightEntity.getRn8());
                        weightEntity.setMuscleWeight(weight2);
                        weightEntity.setBodyLeve(a(iC));
                        weightEntity.setThinWeight(weight3 * (1.0f - axunge));
                        weightEntity.setHeart(iA);
                        return;
                    }
                    e(weightEntity);
                    return;
                }
                weightEntity.setR1(0.0f);
                weightEntity.setRn8("");
                e(weightEntity);
                return;
            }
            b(weightEntity, roleInfo, viVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void b(WeightEntity weightEntity, RoleInfo roleInfo, vi viVar) {
        double d;
        double aCBodyHydro;
        double d2;
        int sex = roleInfo.getSex();
        int age = roleInfo.getAge();
        float height = roleInfo.getHeight();
        double weight = weightEntity.getWeight();
        int r1 = (int) weightEntity.getR1();
        wf.e("WeighDataParser", "weight:" + weight + "，gender:" + sex + "，age:" + age + "，height:" + height + "，bodyImpedance:" + r1);
        double d3 = (weight * 10000.0d) / ((double) (height * height));
        if (age >= 10 && age <= 100) {
            double d4 = height;
            if (d4 >= 100.0d && d4 <= 250.0d && weight >= 30.0d && weight <= 200.0d) {
                boolean z = (TextUtils.isEmpty(viVar.a()) || !viVar.a().endsWith("A")) && viVar.e() != 843465809;
                wf.e("WeighDataParser", "+useDC+" + z);
                if (z) {
                    d = d4;
                    double dCBodyFat = CouStru.getDCBodyFat(sex, age, d4, weight, r1);
                    d2 = dCBodyFat;
                    aCBodyHydro = CouStru.getDCBodyHydro(sex, dCBodyFat);
                } else {
                    d = d4;
                    double d5 = r1;
                    double aCBodyFat = CouStru.getACBodyFat(sex, age, d4, weight, d5);
                    aCBodyHydro = CouStru.getACBodyHydro(sex, d, weight, d5);
                    d2 = aCBodyFat;
                }
                wf.e("WeighDataParser", "bodyFat:" + d2 + "，bodyHydro:" + aCBodyHydro);
                weightEntity.setBmi((float) d3);
                if (d2 < 4.0d || d2 > 75.0d || aCBodyHydro < 0.0d) {
                    wf.e("WeighDataParser", "数据无效，测量脂肪失败");
                    e(weightEntity);
                    return;
                }
                double d6 = d;
                double d7 = aCBodyHydro;
                double d8 = d2;
                double aCBodyVisceralFat = CouStru.getACBodyVisceralFat(sex, age, d6, weight, r1, z);
                double aCBodyMuscle = CouStru.getACBodyMuscle(sex, d8);
                double aCBodyBone = (CouStru.getACBodyBone(sex, d8) * weight) / 100.0d;
                double bodyBMR = CouStru.getBodyBMR(sex, age, d6, weight);
                double aCBodyBoneMuscle = CouStru.getACBodyBoneMuscle(sex, d7, d8);
                double aCBodyProtein = CouStru.getACBodyProtein(d7, aCBodyMuscle, d8);
                double aCBodyAge = CouStru.getACBodyAge(sex, age, d8, aCBodyMuscle, aCBodyVisceralFat, 0, z);
                double aCBodyHealth = CouStru.getACBodyHealth(sex, d8);
                double aCBodyFigure = CouStru.getACBodyFigure(sex, age, d, weight, d8, z);
                weightEntity.setAxunge((float) d8);
                weightEntity.setViscera((float) aCBodyVisceralFat);
                weightEntity.setWater((float) d7);
                weightEntity.setBone((float) aCBodyBone);
                weightEntity.setMuscle((float) aCBodyMuscle);
                weightEntity.setMetabolism((float) bodyBMR);
                weightEntity.setBody_age((float) aCBodyAge);
                weightEntity.setScore((int) aCBodyHealth);
                weightEntity.setBw((float) (((d * 22.0d) * d) / 10000.0d));
                weightEntity.setProtein((float) aCBodyProtein);
                weightEntity.setMuscleWeight((float) ((weight * aCBodyBoneMuscle) / 100.0d));
                weightEntity.setBodyLeve(a((int) aCBodyFigure));
                weightEntity.setThinWeight((float) (((100.0d - d8) * weight) / 100.0d));
                weightEntity.setHeart(ve.a(weightEntity.getRn8()));
                return;
            }
        }
        wf.e("WeighDataParser", "数据无效，测量脂肪失败");
        e(weightEntity);
    }

    private String a(int i) {
        if (i == 1) {
            return "消瘦";
        }
        if (i == 2) {
            return "标准";
        }
        if (i == 3) {
            return "隐形肥胖";
        }
        if (i == 4) {
            return "肌肉型肥胖";
        }
        return "肥胖";
    }

    private void e(WeightEntity weightEntity) {
        weightEntity.setAxunge(0.0f);
        weightEntity.setViscera(0.0f);
        weightEntity.setWater(0.0f);
        weightEntity.setBone(0.0f);
        weightEntity.setMuscle(0.0f);
        weightEntity.setMetabolism(0.0f);
        weightEntity.setBody_age(0.0f);
        weightEntity.setScore(0);
        weightEntity.setBw(0.0f);
        weightEntity.setMuscleWeight(0.0f);
        weightEntity.setProtein(0.0f);
        weightEntity.setBodyLeve("");
        weightEntity.setThinWeight(0.0f);
        weightEntity.setHeart(0);
    }

    public static float e(int i, double d) {
        if (i == 0 || ((int) d) == 0) {
            return 0.0f;
        }
        new DecimalFormatSymbols().setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
        double d2 = ((double) i) / 100.0d;
        return wd.c((float) (d / (d2 * d2)));
    }

    public static int c(Context context, RoleInfo roleInfo, WeightEntity weightEntity) {
        float fB;
        int age = roleInfo.getAge();
        ve veVar = new ve(roleInfo.getHeight(), weightEntity.getWeight(), (byte) roleInfo.getSex(), age, weightEntity.getR1());
        if (weightEntity.getR1() > 0.0f && age > 5) {
            fB = veVar.k();
        } else {
            if (weightEntity.getAxunge() <= 0.0f) {
                return -1;
            }
            fB = ve.b(veVar.g(), weightEntity.getWeight(), veVar.f(), age, weightEntity.getAxunge());
        }
        return ((int) fB) + 1;
    }
}
