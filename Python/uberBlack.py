from car import Car

class UberBlack(Car):
    typeCarAccepted = []
    seatsMaterials = []

    def __init__(self, license, driver, typeCarAccepted, seatsMaterials):
        super.__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterials = seatsMaterials