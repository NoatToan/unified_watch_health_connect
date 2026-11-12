package defpackage;

import com.huawei.sim.esimhandler.EsimChainHandler;
import com.huawei.sim.esimhandler.EsimHandler;

/* JADX INFO: loaded from: classes15.dex */
public class pwi {
    public static EsimChainHandler b() {
        pyf pyfVar = new pyf();
        pyd pydVar = new pyd();
        pyb pybVar = new pyb();
        pwl pwlVar = new pwl();
        pyfVar.setNext(pydVar);
        pydVar.setNext(pybVar);
        pybVar.setNext(pwlVar);
        pwlVar.setNext(null);
        return pyfVar;
    }

    public static EsimHandler d() {
        return new pwl();
    }

    public static EsimHandler c() {
        return new pwm();
    }

    public static EsimHandler a() {
        return new pwf();
    }

    public static EsimHandler e() {
        return new pwk();
    }
}
