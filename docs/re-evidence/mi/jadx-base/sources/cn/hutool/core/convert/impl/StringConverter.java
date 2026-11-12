package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConvertException;
import defpackage.au3;
import defpackage.cid;
import defpackage.lsr;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.TimeZone;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public class StringConverter extends AbstractConverter<String> {
    private static final long serialVersionUID = 1;

    private static String blobToStr(Blob blob) {
        InputStream binaryStream = null;
        try {
            try {
                binaryStream = blob.getBinaryStream();
                String strH = cid.h(binaryStream, au3.f3449b);
                cid.a(binaryStream);
                return strH;
            } catch (SQLException e) {
                throw new ConvertException(e);
            }
        } catch (Throwable th) {
            cid.a(binaryStream);
            throw th;
        }
    }

    private static String clobToStr(Clob clob) {
        Reader characterStream = null;
        try {
            try {
                characterStream = clob.getCharacterStream();
                String strI = cid.i(characterStream);
                cid.a(characterStream);
                return strI;
            } catch (SQLException e) {
                throw new ConvertException(e);
            }
        } catch (Throwable th) {
            cid.a(characterStream);
            throw th;
        }
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public String convertInternal(Object obj) {
        if (obj instanceof TimeZone) {
            return ((TimeZone) obj).getID();
        }
        if (obj instanceof Node) {
            return lsr.a((Node) obj);
        }
        if (obj instanceof Clob) {
            return clobToStr((Clob) obj);
        }
        return obj instanceof Blob ? blobToStr((Blob) obj) : convertToStr(obj);
    }
}
