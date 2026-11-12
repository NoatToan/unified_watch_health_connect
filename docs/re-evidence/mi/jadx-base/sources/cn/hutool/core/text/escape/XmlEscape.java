package cn.hutool.core.text.escape;

import cn.hutool.core.text.replacer.LookupReplacer;
import cn.hutool.core.text.replacer.ReplacerChain;
import cn.hutool.core.text.replacer.StrReplacer;
import defpackage.gv5;

/* JADX INFO: loaded from: classes.dex */
public class XmlEscape extends ReplacerChain {
    protected static final String[][] BASIC_ESCAPE = {new String[]{"\"", "&quot;"}, new String[]{gv5.CONNECT_STR, "&amp;"}, new String[]{"<", "&lt;"}, new String[]{">", "&gt;"}};
    private static final long serialVersionUID = 1;

    public XmlEscape() {
        super(new StrReplacer[0]);
        addChain((StrReplacer) new LookupReplacer(BASIC_ESCAPE));
    }
}
