package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import defpackage.r43;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class CharacterConverter extends AbstractConverter<Character> {
    private static final long serialVersionUID = 1;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Character convertInternal(Object obj) {
        if (obj instanceof Boolean) {
            return r43.f(((Boolean) obj).booleanValue());
        }
        String strConvertToStr = convertToStr(obj);
        if (tt3.H(strConvertToStr)) {
            return Character.valueOf(strConvertToStr.charAt(0));
        }
        return null;
    }
}
