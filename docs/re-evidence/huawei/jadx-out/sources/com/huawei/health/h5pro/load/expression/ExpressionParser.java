package com.huawei.health.h5pro.load.expression;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.exception.H5ProException;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.operation.utils.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class ExpressionParser {
    private ExpressionParser() {
    }

    public static boolean isMatchExpression(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("\\$\\{.+\\..+\\(.*\\)\\}", str);
    }

    public static Object parse(H5ProInstance h5ProInstance, String str) throws H5ProException {
        ExpressionFunction expressionFunction;
        String strSubstring = str.substring(2, str.length() - 1);
        int iIndexOf = strSubstring.indexOf(".");
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        Object obj = ExpressionFunctionRegistry.get(strSubstring2);
        if (obj == null) {
            LogUtil.e("H5PRO_ExpressionParser", a.a("fail to get module instance.", strSubstring2));
            throw new H5ProException(a.a("fail to get module instance.", strSubstring2));
        }
        int iIndexOf2 = strSubstring.indexOf(Constants.LEFT_BRACKET_ONLY);
        String strSubstring3 = strSubstring.substring(iIndexOf + 1, iIndexOf2);
        Method method = null;
        for (Method method2 : obj.getClass().getMethods()) {
            if (Modifier.isPublic(method2.getModifiers()) && (expressionFunction = (ExpressionFunction) method2.getAnnotation(ExpressionFunction.class)) != null && strSubstring3.equals(expressionFunction.alias())) {
                method = method2;
            }
        }
        if (method == null) {
            LogUtil.e("H5PRO_ExpressionParser", a.a("fail to get module method.", strSubstring3));
            throw new H5ProException(a.a("fail to get module method.", strSubstring3));
        }
        int iLastIndexOf = strSubstring.lastIndexOf(Constants.RIGHT_BRACKET_ONLY);
        String[] strArrSplit = new String[0];
        int i = iIndexOf2 + 1;
        if (i < iLastIndexOf) {
            strArrSplit = strSubstring.substring(i, iLastIndexOf).trim().split(",");
        }
        try {
            return method.invoke(obj, transferParamTypes(h5ProInstance, strArrSplit, method));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            LogUtil.e("H5PRO_ExpressionParser", "parse." + e.getMessage());
            throw new H5ProException(e.getMessage());
        }
    }

    public static Object[] transferParamTypes(H5ProInstance h5ProInstance, String[] strArr, Method method) throws H5ProException {
        boolean z;
        if (method == null) {
            throw new H5ProException("method is null");
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (strArr.length != parameterTypes.length) {
            z = true;
            if (parameterTypes.length - strArr.length != 1 || !parameterTypes[0].equals(H5ProInstance.class)) {
                throw new H5ProException("The number of parameters does not match the number of parameter types.");
            }
        } else {
            z = false;
        }
        int length = parameterTypes.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            if (i == 0 && z) {
                objArr[i] = h5ProInstance;
            } else if (parameterTypes[i].equals(String.class)) {
                objArr[i] = strArr[z ? i - 1 : i];
            } else {
                objArr[i] = new Gson().fromJson(strArr[z ? i - 1 : i], (Class) parameterTypes[i]);
            }
        }
        return objArr;
    }
}
