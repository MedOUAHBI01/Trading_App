package com.emsi.trading.modal;

import com.emsi.trading.domaine.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {

private boolean isEnabled=false;
private VerificationType sendTo;

}
