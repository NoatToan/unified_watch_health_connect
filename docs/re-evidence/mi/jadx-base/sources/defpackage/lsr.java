package defpackage;

import cn.hutool.core.exceptions.UtilException;
import java.io.StringWriter;
import java.io.Writer;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public class lsr {
    public static String a(Node node) {
        return d(node, false);
    }

    public static String b(Node node, String str, boolean z) {
        return c(node, str, z, false);
    }

    public static String c(Node node, String str, boolean z, boolean z2) {
        StringWriter stringWriterC0 = lio.C0();
        try {
            f(node, stringWriterC0, str, z ? 2 : 0, z2);
            return stringWriterC0.toString();
        } catch (Exception e) {
            throw new UtilException(e, "Trans xml document to string error!", new Object[0]);
        }
    }

    public static String d(Node node, boolean z) {
        return b(node, "UTF-8", z);
    }

    public static void e(Source source, Result result, String str, int i, boolean z) {
        try {
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            if (i > 0) {
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("doctype-public", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", String.valueOf(i));
            }
            if (tt3.H(str)) {
                transformerNewTransformer.setOutputProperty("encoding", str);
            }
            if (z) {
                transformerNewTransformer.setOutputProperty("omit-xml-declaration", "yes");
            }
            transformerNewTransformer.transform(source, result);
        } catch (Exception e) {
            throw new UtilException(e, "Trans xml document to string error!", new Object[0]);
        }
    }

    public static void f(Node node, Writer writer, String str, int i, boolean z) {
        e(new DOMSource(node), new StreamResult(writer), str, i, z);
    }
}
