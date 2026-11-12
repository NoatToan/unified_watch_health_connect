package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Tokenizer {
    final String pattern;
    final int patternLength;
    TokenizerState state = TokenizerState.LITERAL_STATE;
    int pointer = 0;

    /* JADX INFO: renamed from: ch.qos.logback.core.subst.Tokenizer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.START_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.DEFAULT_VAL_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum TokenizerState {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    public Tokenizer(String str) {
        this.pattern = str;
        this.patternLength = str.length();
    }

    private void addLiteralToken(List<Token> list, StringBuilder sb3) {
        if (sb3.length() == 0) {
            return;
        }
        list.add(new Token(Token.Type.LITERAL, sb3.toString()));
    }

    private void handleDefaultValueState(char c14, List<Token> list, StringBuilder sb3) {
        TokenizerState tokenizerState;
        Token token;
        if (c14 != '$') {
            if (c14 != '-') {
                sb3.append(CoreConstants.COLON_CHAR);
                if (c14 != '{') {
                    sb3.append(c14);
                } else {
                    addLiteralToken(list, sb3);
                    sb3.setLength(0);
                    token = Token.CURLY_LEFT_TOKEN;
                }
                tokenizerState = TokenizerState.LITERAL_STATE;
            } else {
                token = Token.DEFAULT_SEP_TOKEN;
            }
            list.add(token);
            tokenizerState = TokenizerState.LITERAL_STATE;
        } else {
            sb3.append(CoreConstants.COLON_CHAR);
            addLiteralToken(list, sb3);
            sb3.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleLiteralState(char c14, List<Token> list, StringBuilder sb3) {
        if (c14 == '$') {
            addLiteralToken(list, sb3);
            sb3.setLength(0);
            this.state = TokenizerState.START_STATE;
            return;
        }
        if (c14 == ':') {
            addLiteralToken(list, sb3);
            sb3.setLength(0);
            this.state = TokenizerState.DEFAULT_VAL_STATE;
        } else if (c14 == '{') {
            addLiteralToken(list, sb3);
            list.add(Token.CURLY_LEFT_TOKEN);
            sb3.setLength(0);
        } else {
            if (c14 != '}') {
                sb3.append(c14);
                return;
            }
            addLiteralToken(list, sb3);
            list.add(Token.CURLY_RIGHT_TOKEN);
            sb3.setLength(0);
        }
    }

    private void handleStartState(char c14, List<Token> list, StringBuilder sb3) {
        if (c14 == '{') {
            list.add(Token.START_TOKEN);
        } else {
            sb3.append('$');
            sb3.append(c14);
        }
        this.state = TokenizerState.LITERAL_STATE;
    }

    public List<Token> tokenize() {
        char c14;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            int i14 = this.pointer;
            if (i14 >= this.patternLength) {
                break;
            }
            char cCharAt = this.pattern.charAt(i14);
            this.pointer++;
            int i15 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
            if (i15 == 1) {
                handleLiteralState(cCharAt, arrayList, sb3);
            } else if (i15 == 2) {
                handleStartState(cCharAt, arrayList, sb3);
            } else if (i15 == 3) {
                handleDefaultValueState(cCharAt, arrayList, sb3);
            }
        }
        int i16 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
        if (i16 == 1) {
            addLiteralToken(arrayList, sb3);
            return arrayList;
        }
        if (i16 == 2) {
            c14 = '$';
        } else {
            if (i16 != 3) {
                return arrayList;
            }
            c14 = CoreConstants.COLON_CHAR;
        }
        sb3.append(c14);
        addLiteralToken(arrayList, sb3);
        return arrayList;
    }
}
