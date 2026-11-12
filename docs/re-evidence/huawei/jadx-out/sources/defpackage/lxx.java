package defpackage;

import com.huawei.datatype.FitnessUserInfo;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.up.model.UserInfomation;

/* JADX INFO: loaded from: classes10.dex */
public class lxx {
    private static ees l(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        return new eet().b((strE == null || strE.length() <= 4) ? null : strE.substring(4, strE.length()));
    }

    public static UserInfomation c(byte[] bArr) throws eeu {
        return lya.b(l(bArr));
    }

    public static lyf d(byte[] bArr) throws eeu {
        return lya.e(l(bArr));
    }

    public static lyd h(byte[] bArr) throws eeu {
        return lxu.b(l(bArr));
    }

    public static lxy e(byte[] bArr) throws eeu {
        return lxu.e(l(bArr));
    }

    public static int g(byte[] bArr) throws cpy {
        return lxt.a(bArr);
    }

    public static lyk j(byte[] bArr) throws cpy {
        return lxt.e(bArr);
    }

    public static int k(byte[] bArr) throws cpy {
        return lyc.a(bArr);
    }

    public static lyi i(byte[] bArr) throws cpy {
        return lyc.d(bArr);
    }

    public static FitnessUserInfo o(byte[] bArr) throws eeu {
        return lya.a(l(bArr));
    }

    public static int a(byte[] bArr) throws eeu {
        return lxt.d(l(bArr));
    }

    public static lyh b(byte[] bArr) throws eeu {
        return lxt.c(l(bArr));
    }

    public static HeartRateThresholdConfig f(byte[] bArr) throws eeu {
        return lxt.e(l(bArr));
    }
}
