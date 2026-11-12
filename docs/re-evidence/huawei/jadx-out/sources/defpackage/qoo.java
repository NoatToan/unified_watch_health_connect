package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hianalytics.core.transport.Utils;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes16.dex */
public class qoo {
    public static Field e(Class<?> cls, String str, boolean z) {
        if (cls == null || TextUtils.isEmpty(str)) {
            LogUtil.e(Utils.TAG, "cls is null or fieldName is Empty");
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (c(declaredField)) {
                return declaredField;
            }
            if (!z) {
                return null;
            }
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e) {
            LogUtil.e(Utils.TAG, "NoSuchFieldException: ", ExceptionUtils.c(e));
            return null;
        }
    }

    private static boolean c(Member member) {
        return (member == null || !Modifier.isPublic(member.getModifiers()) || member.isSynthetic()) ? false : true;
    }
}
